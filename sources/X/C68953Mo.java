package X;

/* renamed from: X.3Mo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68953Mo {
    public static final C68913Mk A00;
    public static final C68913Mk A01;
    public static final C68913Mk A02;
    public static final C68913Mk A03;
    public static final C68913Mk A04;
    public static final C68913Mk A05;
    public static final C68913Mk A06;
    public static final C68913Mk A07;
    public static final C68913Mk A08;
    public static final C68913Mk A09;
    public static final C68913Mk A0A;
    public static final C68913Mk A0B;
    public static final C68913Mk A0C;
    public static final C68913Mk A0D;
    public static final C68913Mk A0E;
    public static final C68913Mk A0F;
    public static final C68913Mk A0G;
    public static final C68913Mk A0H;
    public static final C68913Mk A0I;
    public static final C68913Mk A0J;
    public static final C68913Mk A0K;
    public static final C68913Mk A0L;
    public static final C68913Mk A0M;
    public static final C68913Mk A0N;
    public static final C68913Mk A0O;
    public static final C68913Mk A0P;
    public static final C68913Mk A0Q;
    public static final C68913Mk A0R;
    public static final C68913Mk A0S;
    public static final C68913Mk A0T;
    public static final C68913Mk A0U;
    public static final C68913Mk[] A0V;

    static {
        C68863Mf c68863Mf = C69053My.A02;
        C68863Mf c68863Mf2 = C69053My.A0B;
        C68913Mk c68913Mk = new C68913Mk("SEND_CLIENT_HELLO", C76573go.class, c68863Mf, null, c68863Mf2);
        A0R = c68913Mk;
        C68863Mf c68863Mf3 = C69053My.A09;
        C68913Mk c68913Mk2 = new C68913Mk("SEND_CLIENT_HELLO_EARLY_DATA", C76583gp.class, c68863Mf, null, c68863Mf3);
        A0S = c68913Mk2;
        C68913Mk c68913Mk3 = new C68913Mk("SEND_EARLY_DATA_DONE", C76613gs.class, c68863Mf3, null, c68863Mf2);
        A0T = c68913Mk3;
        C68913Mk c68913Mk4 = new C68913Mk("EARLY_APP_WRITE", C76603gr.class, c68863Mf3, C68933Mm.A08, c68863Mf3);
        A0D = c68913Mk4;
        C76473ge c76473ge = C68933Mm.A0H;
        C68863Mf c68863Mf4 = C69053My.A06;
        C68913Mk c68913Mk5 = new C68913Mk("RECV_SERVER_HELLO_1", C76713h2.class, c68863Mf2, c76473ge, c68863Mf4);
        A0O = c68913Mk5;
        C76403gX c76403gX = C68933Mm.A0A;
        C68863Mf c68863Mf5 = C69053My.A0A;
        C68913Mk c68913Mk6 = new C68913Mk("RECV_HELLO_RETRY_REQUEST", C76633gu.class, c68863Mf2, c76403gX, c68863Mf5);
        A0M = c68913Mk6;
        C68913Mk c68913Mk7 = new C68913Mk("RECV_SERVER_HELLO_2", C76713h2.class, c68863Mf5, c76473ge, c68863Mf4);
        A0P = c68913Mk7;
        C76393gW c76393gW = C68933Mm.A09;
        C68863Mf c68863Mf6 = C69053My.A04;
        C68913Mk c68913Mk8 = new C68913Mk("RECV_ENCRYPTED_EXTENSIONS", C76623gt.class, c68863Mf4, c76393gW, c68863Mf6);
        A0J = c68913Mk8;
        C76333gQ c76333gQ = C68933Mm.A03;
        C68863Mf c68863Mf7 = C69053My.A03;
        C68913Mk c68913Mk9 = new C68913Mk("RECV_CERTIFICATE_REQUEST", C76553gm.class, c68863Mf6, c76333gQ, c68863Mf7);
        A0H = c68913Mk9;
        C76443gb c76443gb = C68933Mm.A0E;
        C68863Mf c68863Mf8 = C69053My.A05;
        C68913Mk c68913Mk10 = new C68913Mk("RECV_CERTIFICATE_1", C76683gz.class, c68863Mf6, c76443gb, c68863Mf8);
        A0F = c68913Mk10;
        C68913Mk c68913Mk11 = new C68913Mk("RECV_CERTIFICATE_2", C76683gz.class, c68863Mf7, c76443gb, c68863Mf8);
        A0G = c68913Mk11;
        C76453gc c76453gc = C68933Mm.A0F;
        C68863Mf c68863Mf9 = C69053My.A07;
        C68913Mk c68913Mk12 = new C68913Mk("RECV_CERTIFICATE_VERIFY", C76693h0.class, c68863Mf8, c76453gc, c68863Mf9);
        A0I = c68913Mk12;
        C76463gd c76463gd = C68933Mm.A0G;
        C68863Mf c68863Mf10 = C69053My.A08;
        C68913Mk c68913Mk13 = new C68913Mk("RECV_FINISHED_1", C76703h1.class, c68863Mf9, c76463gd, c68863Mf10);
        A0K = c68913Mk13;
        C68913Mk c68913Mk14 = new C68913Mk("RECV_FINISHED_2", C76703h1.class, c68863Mf6, c76463gd, c68863Mf10);
        A0L = c68913Mk14;
        C68863Mf c68863Mf11 = C69053My.A00;
        C68913Mk c68913Mk15 = new C68913Mk("SEND_CERT_CV_FIN", C76563gn.class, c68863Mf10, null, c68863Mf11);
        A0Q = c68913Mk15;
        C68913Mk c68913Mk16 = new C68913Mk("APP_WRITE", C76543gl.class, c68863Mf11, C68933Mm.A02, c68863Mf11);
        A0C = c68913Mk16;
        C68913Mk c68913Mk17 = new C68913Mk("APP_DATA", C76533gk.class, c68863Mf11, C68933Mm.A01, c68863Mf11);
        A0B = c68913Mk17;
        C68913Mk c68913Mk18 = new C68913Mk("NEW_SESSION_TICKET", C76643gv.class, c68863Mf11, C68933Mm.A0B, c68863Mf11);
        A0E = c68913Mk18;
        C68913Mk c68913Mk19 = new C68913Mk("RECV_KEY_UPDATE", C76663gx.class, c68863Mf11, C68933Mm.A0C, c68863Mf11);
        A0N = c68913Mk19;
        C68913Mk c68913Mk20 = new C68913Mk("SEND_KEY_UPDATE", C76673gy.class, c68863Mf11, C68933Mm.A0D, c68863Mf11);
        A0U = c68913Mk20;
        C76303gN c76303gN = C68933Mm.A00;
        C68863Mf c68863Mf12 = C69053My.A01;
        C68913Mk c68913Mk21 = new C68913Mk("APP_CLOSE_1", C76593gq.class, c68863Mf, c76303gN, c68863Mf12);
        A00 = c68913Mk21;
        C68913Mk c68913Mk22 = new C68913Mk("APP_CLOSE_2", C76593gq.class, c68863Mf3, c76303gN, c68863Mf12);
        A03 = c68913Mk22;
        C68913Mk c68913Mk23 = new C68913Mk("APP_CLOSE_3", C76593gq.class, c68863Mf2, c76303gN, c68863Mf12);
        A04 = c68913Mk23;
        C68913Mk c68913Mk24 = new C68913Mk("APP_CLOSE_4", C76593gq.class, c68863Mf5, c76303gN, c68863Mf12);
        A05 = c68913Mk24;
        C68913Mk c68913Mk25 = new C68913Mk("APP_CLOSE_5", C76593gq.class, c68863Mf4, c76303gN, c68863Mf12);
        A06 = c68913Mk25;
        C68913Mk c68913Mk26 = new C68913Mk("APP_CLOSE_6", C76593gq.class, c68863Mf6, c76303gN, c68863Mf12);
        A07 = c68913Mk26;
        C68913Mk c68913Mk27 = new C68913Mk("APP_CLOSE_7", C76593gq.class, c68863Mf7, c76303gN, c68863Mf12);
        A08 = c68913Mk27;
        C68913Mk c68913Mk28 = new C68913Mk("APP_CLOSE_8", C76593gq.class, c68863Mf8, c76303gN, c68863Mf12);
        A09 = c68913Mk28;
        C68913Mk c68913Mk29 = new C68913Mk("APP_CLOSE_9", C76593gq.class, c68863Mf9, c76303gN, c68863Mf12);
        A0A = c68913Mk29;
        C68913Mk c68913Mk30 = new C68913Mk("APP_CLOSE_10", C76593gq.class, c68863Mf10, c76303gN, c68863Mf12);
        A01 = c68913Mk30;
        C68913Mk c68913Mk31 = new C68913Mk("APP_CLOSE_11", C76593gq.class, c68863Mf11, c76303gN, c68863Mf12);
        A02 = c68913Mk31;
        A0V = new C68913Mk[]{c68913Mk, c68913Mk2, c68913Mk3, c68913Mk5, c68913Mk6, c68913Mk7, c68913Mk8, c68913Mk9, c68913Mk10, c68913Mk11, c68913Mk12, c68913Mk13, c68913Mk14, c68913Mk15, c68913Mk18, c68913Mk19, c68913Mk20, c68913Mk4, c68913Mk16, c68913Mk17, c68913Mk21, c68913Mk22, c68913Mk23, c68913Mk24, c68913Mk25, c68913Mk26, c68913Mk27, c68913Mk28, c68913Mk29, c68913Mk30, c68913Mk31};
    }
}