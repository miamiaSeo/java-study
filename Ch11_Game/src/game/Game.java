package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
		// 사용 할 가위, 바위 객체를 배열로 생성
		GameObject[] objects = { new Scissors(), new Rock(), new Paper()};
		Random random = new Random();

	public void run() {
		System.out.println("GAME START!");
//		for(GameObject ob : objects) {
//			System.out.println(ob.toString());
			
			int num = random.nextInt(objects.length);
			GameObject ob = objects[num];
			System.out.println(ob);
		}
	}

