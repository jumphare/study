package p2021_12_29;

public class Repo_211229 {

  public static void main(String[] args) {
   
    int [][]score = {	{ 85,  60,  70},   //0 행
    						{ 90,  95,  80},   //1 행
    						{ 75,  80, 100},   //2 행
    						{ 80,  70,  95},   //3 행
    						{100,  65,  80}    //4 행
    					};
    int [] subject = new int[3]; //과목총점 저장 
    int [] student = new int[5]; //학생의 총점 저장
    String [] sub= {"국어","영어","수학"}; //과목명
    int  r, c;  
	    
    System.out.println("각 과목별 총점구하기 ");
    for(c = 0; c < 3 ; c++){ // 과목         
    	//과목명 출력
    	System.out.print(sub[c]+" 총점: ");
    	//
      for(r = 0; r < 5 ; r++){ //학생      
        subject[c] += score[r][c];   
      }//subject[c]=subject[c]+score[r][c];
      System.out.println(subject[c]);  
    }
 System.out.println();
 
    char name=65; //A
    
    System.out.println("학생별 총점구하기");
    for(r = 0; r < 5 ; r++){    //학생      	
    	//학생 출력
    	System.out.print("학생"+name+" 총점: "); 
    	//
      for(c = 0; c < 3 ; c++){  //과목    
        student[r] += score[r][c];  
      }//student[r]=student[r]+score[r][c];
      System.out.println(student[r]);
      
      name++; 
    }

    
  }//main() end
}// class end        