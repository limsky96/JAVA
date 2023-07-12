package DB.emp.dao;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		
		List<EmpDto> emps = dao.getEmps();
		
		for (EmpDto emp : emps) {
			System.out.print("사원번호 " + emp.getEmpno());
			System.out.println(" 사원이름 " + emp.getEname());
			System.out.println("입사일 " + emp.getHiredate());
		
		}
	}

}
