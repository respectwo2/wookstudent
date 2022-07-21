package Project_2;

import java.util.Scanner;
	
public class BlackJack {
	public static void main(String[] args) {
		
		System.out.println("블랙잭에 오신걸 환영합니다 !");
		System.out.println("--------------------");
		//create out playing deck
		Deck playingDeck =new Deck();
		playingDeck.creatFullDeck();
		playingDeck.shuffle();
	
		//플레이어 덱 추가
		Deck playerDeck =new Deck();
		
		Deck dealerDeck =new Deck();
		
		int playerMoney = 100;
		
		Scanner userInput =new Scanner(System.in);
		
		//Game Loop
		while(playerMoney >0) {
			System.out.println("당신이 가진 돈은 "+playerMoney+"원 입니다. 베팅하실 금액을 적어주세요.");
			int playerBet=userInput.nextInt();
			if(playerBet > playerMoney) {
				System.out.println("가진 돈보다 더 많이 베팅할 수 없습니다.");
				break;
			}
			
			boolean endRound=false;
			
			//start dealing
			//player get 2cards
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			//dealer get 2cards
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while(true) {
				System.out.println("당신의 카드입니다 ");
				System.out.println(playerDeck.toString());
				System.out.println("\n당신의 카드숫자의 합은 "+playerDeck.cardsValue()+" 입니다");
				
				
				//display dealer hand
				System.out.println("딜러의 카드는 : "+dealerDeck.getCard(0).toString()+" 그리고 [숨겨진 패]가 있습니다");
				
				//what does thepalyer wnawt todo ?
				System.out.println("-----------------");
				System.out.println("1.Hit 또는 2.Stay ");
				int response = userInput.nextInt();	
				
				//they hit
				if(response == 1) {
					playerDeck.draw(playingDeck);
					System.out.println("당신이 뽑은 카드는 : "+playingDeck.getCard(playerDeck.deckSize()-1).toString());
					
					//bust if > 21
					if(playerDeck.cardsValue() > 21) {
						System.out.println("버스트 되었습니다!! 숫자의 합 : "+playerDeck.cardsValue()+"\n");
						playerMoney -= playerBet;
						endRound =true;
						break;
					}
				}
				if(response == 2 ) {
					break;
				}
			}
			
			//reveal dealer cards
			System.out.println("딜러의 카드는 : "+dealerDeck.toString()+" 입니다");
			if((dealerDeck.cardsValue()>playerDeck.cardsValue()) && endRound ==false ) {
				System.out.println("딜러가 당신을 이겼습니다!");
				playerMoney -= playerBet;
				endRound = true;
			}
			//Dealer Draw at 16 , stand at17
			while((dealerDeck.cardsValue()<17) && endRound == false) {
				dealerDeck.draw(playingDeck);
				System.out.println("딜러가 뽑은 카드는 "+dealerDeck.getCard(dealerDeck.deckSize()-1).toString()+"이었습니다");
			}
			//display total value for dealer
			System.out.println("\n딜러카드 숫자의 합은 "+dealerDeck.cardsValue()+"입니다");
			//if dealer bust
			if((dealerDeck.cardsValue()>21)&& endRound ==false) {
				System.out.println("\n☆★딜러 버스트! 당신이 승리하였습니다★☆");
				playerMoney += playerBet;
				endRound = true;
			}
			if((playerDeck.cardsValue()== dealerDeck.cardsValue()) && endRound ==false) {
				System.out.println("무승부입니다!! 다음 게임을 진행해주세요");
				endRound = true;
			}
			
			if((playerDeck.cardsValue() > dealerDeck.cardsValue())&& endRound == false) {
				System.out.println("☆★당신이 승리하였습니다!!!★☆");
				playerMoney += playerBet;
				endRound = true;
			}
			
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			System.out.println("------------------");
		
		}
		
	}

}
