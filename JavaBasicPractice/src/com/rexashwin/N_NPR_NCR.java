package com.rexashwin;

// finding permutation and combination

public class N_NPR_NCR {
    public static void main(String[] args) {
        int n, r, npr, ncr, nr, nF=1, rF=1, nrF=1;
        n = 5;
        r = 3;
        nr = n - r;

        for (int i=1; i<=n; i++)
            nF = nF * i;

        for (int i=1; i<=r; i++)
            rF = rF * i;

        for (int i=1; i<=nr; i++)
            nrF = nrF * i;

        npr = nF / nrF;
        ncr = nF / (rF * nrF);

        System.out.println("NPR : "+npr);
        System.out.println("NCR : "+ncr);


    }
}
