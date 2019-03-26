import java.rmi.server.SocketSecurityException;

public class money {
int i;
int j;
	int a[][]=new int[4][4];
	money()
	{
		int fare=0;
		a[0][0]=0;
		a[0][1]=2000;
		a[0][2]=4000;
		a[0][3]=3000;
		a[1][0]=2000;
		a[1][1]=0;
		a[1][2]=2000;
		a[1][3]=1000;
		a[2][0]=4000;
		a[2][1]=2000;
		a[2][2]=0;
		a[2][3]=1000;
		a[3][0]=3000;
		a[3][1]=1000;
		a[3][2]=1000;
		a[3][3]=0;
	}
}
