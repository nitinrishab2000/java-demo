package com;
import java.util.*;
public class AcyclicGraph {
	public boolean checkAcycleGraph(ArrayList<com.AcyclicGraphTest.Pair> list,int N) {
		ArrayList<ArrayList<Integer>> li = new ArrayList<>();
		for(int i = 0;i<=N;i++) {
			li.add(new ArrayList<Integer>());
		}
		for(com.AcyclicGraphTest.Pair p  : list) {
			int x = p.x;
			int y = p.y;
			li.get(x).add(y);
			li.get(y).add(x);
		}
		Queue<Integer> queue = new LinkedList<>();
		int vis[] = new int[N+1];
		Arrays.fill(vis, -1);
		for(int i = 1;i<=N;i++) {
			if(vis[i]!=-1)
				continue;
			queue.add(i);
			while(!queue.isEmpty()) {
				int num = queue.remove();
				vis[num] = i;
				for(Integer p : li.get(num)) {
					if(vis[p]==-1) {
						queue.add(num);
						vis[p] = i;
					}
					else {
						if(vis[p]==i)
							return false;
					}
				}
			}
		}
		return true;
	}
//	static class Pair{
//		int x;
//		int y;
//		Pair(int x,int y){
//			this.x = x;
//			this.y = y;
//		}
//	}
}
