/*

Problem Link : 

*/


#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	unsigned long int m,n,i,j;int N;
cin>>N;
for(;N>0;N--)
{
    cin>>m>>n;
    if(m<3)
        switch (n)
        {
            case 1: cout<<endl;continue;
            case 2: cout<<2<<endl;
                    continue;
            default:cout<<2<<endl;m=3;
        }
    if(m%2==0) m++;        
    for(i=m;i<=n;i+=2)
    {  
        for(j=3;j<=i/j;j+=2)
            if(i%j==0)
                {j=0;break;}
        if(j)
        cout<<i<<endl;
    }
        cout<<endl;
 
}
	return 0;
} 
