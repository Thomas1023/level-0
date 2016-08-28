
	
	import java.io.File;

	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.swing.JOptionPane;

	public class animalfarm {

		animalfarm() {
			/*
			 * 1. Ask the user which animal they want, then play the sound of that
			 
			 * animal.
			 */
			while(1==1){
				
			String ans =JOptionPane.showInputDialog("name an animal (cow,dog,duck,cat,llama) ");
			if(ans.equalsIgnoreCase("cow")){
				playMoo();
			}
			if(ans.equalsIgnoreCase("dog")){
				playWoof();
			}
			if(ans.equalsIgnoreCase("duck")){
					playQuack();
				}
			if(ans.equalsIgnoreCase("cat")){
				playCat();
			}
			if(ans.equalsIgnoreCase("llama")){
				playllama();
			}
			}
			
			

			/* 2. Make it so that the user can keep entering new animals. */
		}

		void playMoo() {
			playNoise(mooFile);
		}

		void playQuack() {
			playNoise(quackFile);
		}

		void playWoof() {
			playNoise(woofFile);
		}
		void playllama() {
			
			playNoise(llamaFile);
			
		}
		void playCat() {
			
			playNoise(meowFile);
			
		}
		

		  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
		String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
		String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
		String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
		String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


		/* Ignore this stuff */

		public void playNoise(String soundFile) {
	    	try {
	   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
	   		 Clip clip = AudioSystem.getClip();
	   		 clip.open(audioInputStream);
	   		 clip.start();
	   		 Thread.sleep(3400);
	    	} catch (Exception ex) {
	        	ex.printStackTrace();
	    	}
		}

		public static void main(String[] args) {
			new animalfarm();
		}

	}


