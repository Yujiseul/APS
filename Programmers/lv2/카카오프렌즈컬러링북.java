class Solution {
    static int[] dr = {-1, 1, 0, 0}; // 상하좌우
	static int[] dc = {0, 0, -1, 1}; // 상하좌우
	static boolean[][] visited;
	static int M, N, g;
	static int[][] pic;
    
    public int[] solution(int m, int n, int[][] picture) {
        M = m;
        N = n;
        pic = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				pic[i][j] = picture[i][j];
			}
		}
		
		
		int cnt = 0;
		int maxg = 0;
		
		for(int r=0; r<M; r++) {
			for(int c=0; c<N; c++) {
				g=0;
				if(!visited[r][c] && pic[r][c]>0) {
					cnt++;
					g =dfs(r, c);
				}
				
				if(maxg<g) {
					maxg = g;
				}
			}
		}
		
		int[] answer = new int[2];
		answer[0] = cnt;
		answer[1] = maxg;
        return answer;
    }
    
    static int dfs(int r, int c) {
		
		visited[r][c] = true;
		int num = pic[r][c];
		
		for(int i=0; i<4; i++) {
			
			int nr = r+dr[i];
			int nc = c+dc[i];
			
			
			if(nr<0 || nc<0 || nr>=M|| nc>=N) {
				continue;
			}
			
			if(visited[nr][nc] || pic[nr][nc] != num) {
				continue;
			}
			
			dfs(nr, nc);
			g++;
		}
		return g+1;
		
		
	}
}
