public class adsmain{
	public static void main(String args[]){
		
		double a[][]={	{0,2,5,7  ,100,100},
						{0,0,2,100,100,6  },
						{0,0,0,3  ,1  ,100},
						{0,0,0,0  ,7  ,100},
						{0,0,0,0  ,0  ,0  }};
		double b[]=new double[6];
		FibonacciHeap fh = new FibonacciHeap();
		Map<FibonacciHeapNode,Integer> map = new HashMap<FibonacciHeapNode,Integer>();
		for(int i=1;i<6;i++){
			int vertex=i;
			double key=a[0][i];
			FibonacciHeapNode n=new FibonacciHeapNode(vertex,key);
			map.put(n,key);
			fh.insert(n,key);
		}

		int p=0,q=0;int count=0;

		while(!fh.isEmpty()){
			if(fh.size()==1)count=1;
			FibonacciHeapNode min=fh.removeMin();
			q=min.getData();
			double minDist=min.getKey();
			b[q]=minDist;
			//p=q;
			FibonacciHeap tempfh = new FibonacciHeap();
			while(!fh.isEmpty()){
				FibonacciHeapNode tempnode;
				//if(count==1)tempnode=min;
				tempnode=fh.removeMin();
				double currentkey=tempnode.getKey();
				int coord=tempnode.getData();
				System.out.println("value of p="+p);
				double newkey=minDist+a[p+1][coord];
				System.out.println("Currentkey="+currentkey);
				System.out.println("newkey="+newkey);
				if(currentkey<newkey)newkey=currentkey;
				tempfh.insert(tempnode,newkey);

			}
			//System.out.println("Size of fh="+fh.size());
			//if(fh.size()==1){FibonacciHeapNode whatever=fh.removeMin();System.out.println("whatever="+whatever.getKey());}
			System.out.println("Size of fh="+fh.size());
			//System.out.println(fh.toString());
			System.out.println("Size of tempfh="+tempfh.size());
			tempfh.display();
			//fh=FibonacciHeap.union(fh,tempfh);
			fh=tempfh;
			//b[p][q]=fh.min().getKey();
			p=q;count++;

			for(int m=0;m<6;m++){
			System.out.print(b[m]+"  ");
			System.out.println();
		}


		}

		
	}
}