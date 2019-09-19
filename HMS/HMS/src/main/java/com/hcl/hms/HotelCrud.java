package com.hcl.hms;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HotelCrud {
	
	
	
	public List<Booking> getAllBookings() {
		List<Booking> bookings = new ArrayList<Booking>();
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Booking");
		List list = q.list();
		for(Object obj : list) {
			Booking b = (Booking)obj;
			bookings.add(b);
		}
		return bookings;		
	}
	
	
	public String generateRoomId (){ // working properly
		String rid = "";
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select max(roomId) from Room");
		for(Iterator it = q.iterate();it.hasNext();) {
			rid = (String)it.next();
			if(rid == null) {
				rid = "R000";
			}
			int id = Integer.parseInt(rid.substring(1));
			id++;
			rid = String.format("R%03d", id);
			
		}
		return rid;
	}

	public String generateBookingId (){ // working properly
		String bid = "";
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select max(bookId) from Booking");
		for(Iterator it = q.iterate();it.hasNext();) {
			bid = (String)it.next();
			if(bid == null) {
				bid = "B000";
			}
			int id = Integer.parseInt(bid.substring(1));
			id++;
			bid = String.format("B%03d", id);
			
		}
		return bid;
	}
	public boolean addRooms(Room room) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		room.setStatus("Available");
		s.save(room);
		Transaction t = s.beginTransaction();
		t.commit();
		return true;
	}
	
	public List<Room> getAvailableRooms() {
		
		List<Room> rooms = new ArrayList<Room>();
		
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Room");
		List res = q.list();
		for(Object obj : res) {
			Room room = (Room)obj;
			if(room.getStatus().equals("Available")) {
				rooms.add(room);
			}
			
		}
		return rooms;
		
	}
	
	public Room getRoomByid(String rid) {
		Room room = new Room();
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Room where RoomId = ?");
		q.setParameter(0, rid);
		List list = q.list();
		for(Object obj : list) {
			room = (Room)obj;
			// System.out.println(room.getStatus());
		}
		return room;
	}
	public boolean bookRoom(Booking obj) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		obj.setChkDate(new Date());
		
		s.save(obj);
		Transaction t = s.beginTransaction();
		t.commit();
		updateRoomStatus(obj.getRoomId(), "Booked");
		return true;
	}

	public boolean updateRoomStatus(String rid,String status) {
	
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Room room = new Room();
		Room tempRoom = getRoomByid(rid);
		String type = tempRoom.getType();
		int cpd = tempRoom.getCostPerDay();
		room.setRoomId(rid);
		room.setStatus(status);
		room.setCostPerDay(cpd);
		room.setType(type);
		
		s.update(room);
		Transaction t = s.beginTransaction();
		t.commit();
		return true;
	}
}
