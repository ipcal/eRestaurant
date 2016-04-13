package eres.view;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import eres.controller.ReservationManagement;
import eres.model.Reservation;

public class ReservationAction extends ActionSupport{

	private static final long serialVersionUID = 9149826260758390091L;
    private Reservation reservation;
    private List<Reservation> reserList;
    private String reserId;

    private ReservationManagement reserManagement;
    
    public ReservationAction() {
    	reserManagement = new ReservationManagement();
    }
    
    public String execute() {
        this.reserList = reserManagement.list();
        System.out.println("execute called");
        return SUCCESS;
    }
    
    public String add() {
        System.out.println("Reservation.add:" + getReservation());
        try {
        	reserManagement.add(getReservation());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.reserList = reserManagement.list();
        return SUCCESS;
    }
    
    
    public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public List<Reservation> getReserList() {
		return reserList;
	}

	public void setReserList(List<Reservation> reserList) {
		this.reserList = reserList;
	}

	public String getReserId() {
		return reserId;
	}

	public void setReserId(String reserId) {
		this.reserId = reserId;
	}
}
