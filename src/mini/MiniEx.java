package mini;

import java.util.List;
import java.util.Scanner;

public class MiniEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";

	public static void main (String[] args) {
		System.out.println(filename);
		File file = new File(filename);
		
		
		private static void run(List<MiniEx>mini) {
			boolean runx = true;
			int num = 0;
			String serchstr = "";
			System.out.println("**********************");
			System.out.println("전화번호 관리 프로그램");
			System.out.println("**********************");
			while(runx) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
				System.out.println("----------------------");
				System.out.println("메뉴번호: ");
				num = sc.nextInt();
				
				switch(num) {
				case 1:
					System.out.println();
					System.out.println("1.리스트>");
					showinfo(mini);
					System.out.println();
					break;
				case 2:
					System.out.println();
					System.out.println("2.등록>");
//					add(sc,mini);
					break;
				case 3:
					System.out.println();
					System.out.println("3.삭제");
					System.out.println("번호");
//					delete(sc,mini);
					break;
				case 4:
					System.out.println();
					System.out.println("4.검색");
					System.out.println("이름:");
					search(mini,serchstr);
					System.out.println();
					break;
				case 5:
					System.out.println();
					System.out.println("******************");
					sc.close();
					runx = false;
					break;
					default:
						System.out.println("잘못입력하셨습니다");
						
				}
			}
		}
		private static void search(List<MiniEx>mini,String str) {
			for(int i=0; i<mini.size(); i++) {
				MiniEx serchmini = (MiniEx) mini.get(i);
				if(serchmini.getName().contains(str)) {
					System.out.println(serchmini.toString());
				}
			}
		}
		private static void delete(Scanner sc, List<Mini>mini) {
			int del = sc.nextInt();
			mini.remove(del -1);
			System.out.println();
			System.out.println("삭제 되었습니다");
			
		}
		private static void showinfo(List<MiniEx> mini) {
			for(int i=0; mini.size() i++) {
				System.out.println(mini.get(i).toString());
			}
		}

		private static void add(Scanner sc, List<reset>mini) {
			String name;
			String hp;
			String tel;
			System.out.println("이름:");
			name=sc.next();
			System.out.println("휴대폰번호:");
			hp=sc.next();
			System.out.println("회사번호:");
			tel=sc.next();
			MiniEx.add(new mini(name,hp,tel));
			update(mini);
			System.out.println();
			wirteTxt(mini);
			System.out.println("등록되었습니다");	
			
		}
		private static void update(List<reset>mini) {
			for(int i=0; i< mini.size(); i++) {
				Mini n = (Mini)mini.get(i);
				n.setNum( i +1);
			}
		}

	
}
