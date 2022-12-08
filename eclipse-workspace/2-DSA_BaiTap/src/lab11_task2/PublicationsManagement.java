package lab11_task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicationsManagement {
	private List<Publication> list;

	/**
	 * @param list
	 */
	public PublicationsManagement(List<Publication> list) {
		this.list = list;
	}
	/**
	3)typePublication():
	4) checkMagazineUnder10year():
	5) sameTypeAndAuthor()
	6) costPublications()
	7) mostPageChaptersReferenceBook
	8) findMagazine()
	9) findMagazineByYear()
	10) sortPublications()
	11) Statistics on the number of publications by year of publication. 
	 * 
	 */
	
	//3.typePublication Method: xac dinh loai an pham
	public String typePublication(Publication p) {
		return p.type();
	}
	//4.checkMagazine10year Method: kiem tra tap chi cach day 10 nam?
	public boolean checkMagazine10year(Publication p,int year) {
		if(typePublication(p).equals("Magazine") && (year-p.getYearPublication())==10) {
			return true;
		}
		return false;
	}
	//5.sameTypeAndAuthor Method: Kiem tra 2 an pham cung laoi va cung tac gia
	public boolean sameTypeAndAuthor(Publication p1,Publication p2) {
		if(typePublication(p1).equals(typePublication(p2)) && (p1.getAuthor().equals(p2.getAuthor()))) {
			return true;
		}
		return false;
	}
	//6.costPublications Method;
	public double costPublications() {
		double re  = 0;
		for (Publication p : list) {
			re += p.getPrice();
		}
		return re;
	}
	//7.mostPageChaptersReferenceBook Method
	public Publication mostPageChaptersReferenceBook() {
		Publication re = list.get(0);
		for(int i =1; i<list.size();i++) {
			Publication temp = list.get(i);
			if(re.mostPageChaptersReferenceBook().getPageNumber() <
				temp.mostPageChaptersReferenceBook().getPageNumber()) {
				re = temp;
			}
		}
		return re;
	}
	//8.findMagazine Method
	public boolean findMagazine(String magazineName) {
		for(Publication p :list) {
			if(p.getMagazineName().equals(magazineName)) return true;
		}
		return false;
	}
	//9.findMagazineByYear Method
	public List<Publication> findMagazineByYear(int year) {
		List<Publication> re = new ArrayList<Publication>();
		for (Publication p : list) {
			if(p.type().equals("Magazine") && (year-p.getYearPublication())==1) {
				re.add(p);
			}
		}
		return re;
	}
	//10.sortPublications()
	public void sortPublications() {
		list.sort(new Comparator<Publication>() {

			@Override
			public int compare(Publication o1, Publication o2) {
				int c = o1.getTitle().compareTo(o2.getTitle());
				if(c!= 0) return c;
				else return -o1.getYearPublication()+o2.getYearPublication();
			}
		});
	}
	//11.statistics on the number of publications by year of publication. 
	public Map<Integer, Integer> statistic(){
		Map<Integer, Integer> re = new HashMap<>();
		for (Publication p : list) {
			if(re.containsKey(p.getYearPublication())) {
				Integer newValue = re.get(p.getYearPublication()+1);
				re.put(p.getYearPublication(), newValue);
			}else {
				re.put(p.getYearPublication(), 1);
			}
		}
		return re;
	}
	
}
