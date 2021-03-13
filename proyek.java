import java.util.Scanner;
public class proyek{
	public static void main(String[] args) {
		int jumlah,i,j, swap,pilih,lagi,a,d,la,bilangan,hasil,t,l;
		Scanner scan = new Scanner(System.in);


		int array[] = {3,5,1,4,2,6,8,7};
		String list[]={"kubus","balok","tabung","kerucut","limas segi tiga", "limas segi empat","bola","prisma"};

		for(i=0; i<(array.length-1);i++)
		{
			for(j=0;j<array.length-i-1;j++)
			{
				if (array[j] > array[j+1])
				{
					swap = array[j];
					array[j] = array[j+1];
					array[j+1]=swap;{}
				}
			}
		}


		for(i=0;i<array.length; i++){
			System.out.println(array[i]+". "+list[i]);
		}
		pil:
		for(;;){

			System.out.print("\nPilih bangun ruang Yang diinginkan : ");
			pilih=scan.nextInt();

			System.out.print("Pilihan Rumus bangun ruang anda no :"+pilih);
			System.out.println();
			switch (pilih){
				case 1:
				System.out.print("Masukkan angka bilangan bulat : ");
				bilangan=scan.nextInt();
				hasil=bilangan * bilangan * bilangan;
				System.out.println("rumus volume kubus :V = s x s x s");
				System.out.print("contoh soal \ndiketahui\ns="+bilangan+" cm\n");
				System.out.print("ditanya?\nvolume kubus?\n");
				System.out.print("penyelesaian:\nV = s x s x s\n");
				System.out.print("V = "+bilangan+" cm x "+bilangan+" cm x "+bilangan+" cm \nV =  "+hasil+" cm kubik \n");
				break;
				case 2:
				int p;

				System.out.print("Masukkan panjang balok :  ");
				p=scan.nextInt();
				System.out.print("Masukkan lebar balok :  ");
				l=scan.nextInt();
				System.out.print("Masukkan tinggi balok :  ");
				t=scan.nextInt();
				hasil=p *l * t;
				System.out.println("rumus volume balok  :V = p x l x t");
				System.out.println("contoh soal\ndiketahui\np="+p+" cm\nl="+l+"cm \nt="+t);
				System.out.print("ditanya?\nhitunglah volume balok?\n");
				System.out.print("penyelesaian :\nv =V = p x l x t\n");
				System.out.print("V ="+p+" cm x "+l+" cm x "+t+" cm \nV = "+hasil+" cm balok \n");
				break;
				case 3:
				System.out.print("Masukkan tinggi tabung");
				t=scan.nextInt();
				System.out.print("Masukkan jari-jari tabung");
				j=scan.nextInt();
				System.out.print("Masukkan diameter tabung");
				d=scan.nextInt();
				hasil=t*j*d;
				System.out.println("rumus volume tabung :V = π x r x r x t");
				System.out.println("contoh soal\ndiketahui\nr="+t+"cm\nt="+j+"cm\nd="+d);
				System.out.print("ditanya?\nhitunglah volume tabung\n");
				System.out.print("penyelesaian :\nV = π x r x r x t\n");
				System.out.print("V="+t+"cm\nt="+d+"cm\nd="+d+" cm \nv ="+hasil+" cm tabung \n");
				break;
				case 4:
				System.out.println("rumus volume kerucut  :");
				break;
				case 5:
				System.out.print("Masukkan tinggi limas :  ");
				t=scan.nextInt();
				System.out.print("Masukkan alas segitiga :  ");
				la=scan.nextInt();
				double lla=la,ta=t,hss;
				hss= 0.5*lla*ta;
				System.out.println("rumus volume limas segi tiga :V = ⅓ x La x t");
				System.out.println("contoh soal\ndiketahui\nt="+t+"cm\na="+la);
				System.out.print("ditanya?\nhitunglah volume limas segi tiga\n");
				System.out.print("pernyataan :\nv= ⅓ x La x t");
				System.out.print("v="+t+"cm\nla="+la+"cm \nv="+hss+" cm limas segitiga\n");
				break;
				case 6:		
				System.out.println("Masukkan alas limas segi empat");
				t=scan.nextInt();
				System.out.println("Masukkan tinggi limas segi empat");
				a=scan.nextInt();
				hasil=a*t;
				System.out.println("rumus volume :V= ⅓ x L alas x t");
				System.out.println("contoh soal\ndiketahui\na="+a+"cm\nt="+t);
				System.out.print("ditanya?\nhitunglah volume prisma\n");
				System.out.print("pernyataan :\nv= a × t");
				System.out.print("t="+t+"cm \nv="+hasil+" cmlimas segi empat\n");
				break;
				case 7:
				System.out.print("Masukkan angka bilangan bulat : ");
				bilangan=scan.nextInt();
				hasil=bilangan *  bilangan;
				System.out.println("rumus volume bola :V =V = 4/3 x π x r³");
				System.out.print("contoh soal \ndiketahui\ns="+bilangan+" cm\n");
				System.out.print("ditanya?\nvolume bola?\n");
				System.out.print("penyelesaian:\nV = s x s x s\n");
				System.out.print("V = "+bilangan+" cm x "+bilangan+" cm x \nV =  "+hasil+" cm \n");
				break;
				case 8:
				System.out.println("Masukkan tinggi prisma");
				t=scan.nextInt();
				System.out.println("Masukkan luas alas prisma");
				a=scan.nextInt();
				hasil=a*t;
				System.out.println("rumus volume :V = Luas alas x t");
				System.out.println("contoh soal\ndiketahui\n="+a+"cm\nt="+6); 
				System.out.print("ditanya?\nhitunglah volume prisma\n");
				System.out.print("pernyataan :\nv= La x t");
				System.out.print("v="+a+"cm\nt="+t+"cm \nv="+hasil+" cm prisma\n");
				break;
				default : 
				continue pil;

			}
			System.out.print("Apakah Anda Ingin Coba lagi? (1:0)");
			lagi=scan.nextInt();
			System.out.println();
			if(lagi==1){
				continue pil;
			}else{
				System.out.print("Terima kasih");
				System.exit(0); 
			}
			break;
		}
	}

}

