package priorityQueue;

import java.util.Comparator;

public class PatientPriorityComparator implements Comparator {

	@Override
	public int compare(Object patient, Object priorityPatient) {

		// comparison code for Patients on the basis of emergency
		Patient p1 = (Patient) patient;
		Patient p2 = (Patient) priorityPatient;
		// 1 dscending
		// -1 asscending

		if (p1.getPriority() < p2.getPriority())
			return 1;
		if (p1.getPriority() > p2.getPriority())
			return -1;
		else {
			if (p1.getId() < (p2.getId()))
				return -1;
			if (p1.getId() > (p2.getId()))
				return 1;
		}
		return 0;

	}

}
