package exercise;
import java.util.*;

//BlackJack.java
public class BlackJack_example {
	public static int dealer_or_user = 0; // ����(0)�� computeScore�� ����(1)�� computeScore�� �����ϱ� ����
	
    public static int computeScore(ScoreTable table, Vector<Card> cards) {
    //(H) table �̿��� card ���� ���� ������ ����
    	int count=0; // ī���� ����
    	int aCard=0; // Aī�带 �ʿ信 ���� 1�Ǵ� 11�� ������ �����ϱ� ���� ����
    	
    	if(dealer_or_user == 0) {
    		for(int i=0; i<cards.size(); i++) { 
        		int[] value = new int[2];
        		value = table.score(cards.get(i));
        		
        		if(value[0] == 1 && aCard == 0 && (i==0 || i==1) ) { // ó�� 2���� �� �� 1���� "A"�� ���� ���
    			    int num11 = value[1]; // "11"
    			    count += num11;
    			    aCard++;
    		    }
    		
    		    else { 
    			    int num = value[0];
    			    count += num;
    		    }
    		}
    	}
    	
    	if(dealer_or_user == 1) {
    	    for(int i=0; i<cards.size(); i++) {
    	        int[] value = new int[2];
    	        value = table.score(cards.get(i));
    	    
    	        if(value[0] == 1) { // "A"�� ���(���ÿ� "A"���� ����)
    	            int num1 = value[0]; // "1"
    	            int num11 = value[1]; // "11"
	            
    	            if( count > 10 ) {
    	                count += num1;
    	                if( count > 21 && aCard == 1 ){
    	                    count = count -10;
    	                    aCard = 0;
    	                    }
    	                }
    	            else {
    	                count += num11;
    	                aCard++;
    	                }
    	            }
    	        else { // "A"�� �ƴҰ��
    	            int num = value[0];
    	            count += num;
    	            if( count > 21 && aCard == 1 ){
    	                count = count -10;
    	                aCard = 0;
    	            }
    	        }
    	    }
    	}
    	
    	return count;
    }
    
    public static boolean is_bust(ScoreTable table, Vector<Card> cards) {
    //(I) table �̿��� card ���� ���� ������ 21�� �ʰ��ϴ��� �ƴ��� ����
    	int count=0; // ī���� ����
    	int aCard=0; // Aī�带 �ʿ信 ���� 1�Ǵ� 11�� ������ �����ϱ� ���� ����
    	
    	if(dealer_or_user == 0) {
    		for(int i=0; i<cards.size(); i++) { 
        		int[] value = new int[2];
        		value = table.score(cards.get(i)); 
        		
    		    if(value[0] == 1 && aCard == 0 && (i==0 || i==1) ) { // ó�� 2���� �� �� 1���� "A"�� ���� ���
    			    int num11 = value[1]; // "11"
    			    count += num11;
    			    aCard++;
    		    }
    		
    		    else {
    			    int num = value[0];
    			    count += num;
    		    }
    		}
    	}
    	
    	if(dealer_or_user == 1) {
    	    for(int i=0; i<cards.size(); i++) {
    	        int[] value = new int[2];
    	        value = table.score(cards.get(i));
    	    
    	        if(value[0] == 1) { // "A"�� ���(���ÿ� "A"���� ����)
    	            int num1 = value[0]; // "1"
    	            int num11 = value[1]; // "11"
	            
    	            if( count > 10 ) {
    	                count += num1;
    	                if( count > 21 && aCard == 1 ){
    	                    count = count -10;
    	                    aCard = 0;
    	                    }
    	                }
    	            else {
    	                count += num11;
    	                aCard++;
    	                }
    	            }
    	        else { // "A"�� �ƴҰ��
    	            int num = value[0];
    	            count += num;
    	            if( count > 21 && aCard == 1 ){
    	                count = count -10;
    	                aCard = 0;
    	            }
    	        }
    	    }
    	}
    	
    	if (count > 21) {return true;}
    	else {return false;}
    }
    
    public static boolean checkBlackjack(Vector<Card> cards) {
    //(J) ī����� �޾� �������� �ƴ��� ����
        
    	String str1 = cards.get(0).getRank();    	
    	String str2 = cards.get(1).getRank();
    	
    	// ���� 2���� ī�� �� �ϳ��� A�̰� �ٸ� �ϳ��� 10,J,Q,K�� ��� ���� 
    	if(str1.equals("A") && (str2.equals("10")|| str2.equals("J") || str2.equals("Q") || str2.equals("K"))) {return true;}
    	else if(str2.equals("A") && (str1.equals("10") || str1.equals("J") || str1.equals("Q") || str1.equals("K"))) {return true;}
    	else {return false;}
    }
    
    public static void sleep(int time) {
    //(K) time ��ŭ pause �� �簳. (����: �и�������)
    	try {
    		for (int i = 0; i < time; i++) {Thread.sleep(1);} // 1ms x time��ŭ pause�� �簳
    	}
    	catch(Exception e) {System.out.println(e);}
    }
    
    public static void main(String[] args) {
    //(L) ���� ���� �κ�
    	
    	Scanner scan = new Scanner(System.in);	
        
    	System.out.print("����� ���� ������ �Է����ּ��� >> ");
    	int deckEa = scan.nextInt();
    	System.out.println( deckEa + "���� ��, " + (deckEa*52) + "���� ī�带 ����մϴ�.");
    	System.out.println();
    	CardPool CP = new CardPool(deckEa);
    	
    	Player User = new Player();
    	User.addCard(CP.drawCard());
    	User.addCard(CP.drawCard());
    	System.out.println("����� ī��� " + User.getHand().toString() + " �Դϴ�." );
    	
    	Player Dealer = new Player();
    	Dealer.addCard(CP.drawCard());
    	Dealer.addCard(CP.drawCard());
    	System.out.println("������ ������ ī��� " + Dealer.get(0).toString() + " �Դϴ�." );
    	System.out.println();
    	
    	if (checkBlackjack(User.getHand())) {
    	    System.out.println("����� BlackJack���� �¸��߽��ϴ�." );
        }
        else {
        	ScoreTable Table = new ScoreTable();
        	System.out.println("����� �����Դϴ�." );
        	while(true) {
        		System.out.print("ī�带 �� �����ðڽ��ϱ� ? (hit/stand) >> " );
        		String str = scan.next();
        		System.out.println();
    	    
    	        if (str.equals("hit")) {
    	        	
    	        	Card cardInput = CP.drawCard();
    	        	System.out.println( cardInput.toString() + " �� �޾ҽ��ϴ�." );
    	        	User.addCard(cardInput);
    	        	System.out.println("����� ī��� " + User.getHand().toString()  + " �Դϴ�." );
    	        	System.out.println();
    	        	
    	        	dealer_or_user = 1;
    	        	if(is_bust(Table, User.getHand())) {
    	        		System.out.println("���� ������ 21�� �ʰ��Ͽ� �й��߽��ϴ�." );
    	        		dealer_or_user = 0;
    	        		break;
    	        	}
    	        	dealer_or_user = 0;
    	        }
    	        else if(str.equals("stand")) {
        	        System.out.println("����� ���ʰ� �������ϴ�." );
        	        System.out.println();
        	        System.out.println("������ �����Դϴ�." );
            	    System.out.println("������ ī��� " + Dealer.getHand().toString() + " �Դϴ�." );
            	    System.out.println();
        	    
            	    if (checkBlackjack(Dealer.getHand())) {
        	        	System.out.println("������ BlackJack���� �й��߽��ϴ�." );	
        	        }
        	        else { 
        	    	    while(true){
        	    		    if(computeScore(Table, Dealer.getHand()) < 17) {
        	    	    	    sleep(3);
        	    		        Card cardInput = CP.drawCard();
        	                    System.out.println("������ " + cardInput.toString() + " �� �޾ҽ��ϴ�." );
        	                    Dealer.addCard(cardInput);
        	                    System.out.println("������ ī��� " + Dealer.getHand().toString() + " �Դϴ�." );
        	                    System.out.println();
        	    		    }
        	                
        	                if (is_bust(Table, Dealer.getHand())) {
                     	        System.out.println("���� ���� ������ 21�� �ʰ��Ͽ� �¸��߽��ϴ�." );
                     	        break;
        	                }
                     	    
        	                else if ( computeScore(Table,Dealer.getHand()) > 16 && computeScore(Table,Dealer.getHand()) < 22 ) {
                     	    	System.out.println("������ ���ʰ� �������ϴ�." );
                	        	System.out.println();
                	        	
                	        	dealer_or_user = 1;
                	        	int userScore = computeScore(Table, User.getHand());
                	        	dealer_or_user = 0;
                	        	int dealerScore = computeScore(Table, Dealer.getHand());
                	        	
                	        	System.out.println("����: " + userScore + " vs ����: " + dealerScore );
            	    	        if (userScore < dealerScore) {System.out.println("�й��߽��ϴ�.");}
                                else if (userScore == dealerScore) {System.out.println("���º�");}
                                else {System.out.println("�¸��߽��ϴ�.");}
                                break;    
                 	        }
        	    	    }
        	        } 
        	        break;
    	        }
    	    }        	
        } 
    } 
}