public class a23cuatroxcuatro

	{public static void main (String args[])
	
		{Teclado t=new Teclado();
		int f,c,e,i,band;
		double mtr,par,fact,cf;
		
		double A[][]=new double[4][4];
		double U[]=new double[4];
		double T[]=new double[4];
		
		e=0; i=0; mtr=0; par=0; fact=1; cf=1;
		 
for (f=0;f<=3;f++)
{
	for (c=0;c<=3;c++)
	{	
	do
	{		
	try
		{	
		System.out.println("Captura un numero");
		A[f][c]=t.leeInt();
		band=0;
		}
	catch (NumberFormatException z)
		{
		System.out.println("Capture solo numeros enteros positivos");
		band=1;
		}
	}while ((band==1)||(A[f][c]<0));
	
	if (A[f][c]%3==0)
	{
		mtr=mtr+A[f][c];
	}
	if (A[f][c]%2==0)
	{
		par=par+1;
	}
	if (c==1)
	{
		U[e]=A[f][c];
		e=e+1;
	}
	if (c==3)
	{
		T[i]=A[f][c];
		i=i+1;
  	}
	}
}
		System.out.println();//
	System.out.println("Factorial del elemento fila (3) columna (2): ");
	
	while (cf<=A[3][2])
	{
		fact=fact*cf;
		cf=cf+1;
		System.out.println(fact+",   ");
		
	}
		System.out.println();//
	System.out.println("Suma de los numeros multiplos de 3: "+mtr);
		System.out.println();//
	System.out.println("Cantidad de numeros pares: "+par);
		System.out.println();//
	for	(e=0;e<=3;e++)
	{
		System.out.println("Columna 1: "+U[e]); 
	}
		System.out.println();//
	for	(i=0;i<=3;i++)
	{
		System.out.println("Columna 3: "+T[i]); 
	}

	for	(f=0;f<=3;f++)
	{
		System.out.println();//
	for (c=0;c<=3;c++)
	{
	System.out.println("Matriz: "+A[f][c]);
	}
	}
System.exit(0); 
		}
	}

		 