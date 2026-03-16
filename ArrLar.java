class ArrLar {
    public static void main(String[] args) {

        int[][] a = {{5,9,3},{7,2,8}};
        int max = a[0][0];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }

        System.out.println("Largest element: " + max);

    }
}
