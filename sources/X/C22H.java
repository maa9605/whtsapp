package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A0F uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.22H  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C22H {
    public static final /* synthetic */ C22H[] A00;
    public static final C22H A01;
    public static final C22H A02;
    public static final C22H A03;
    public static final C22H A04;
    public static final C22H A05;
    public static final C22H A06;
    public static final C22H A07;
    public static final C22H A08;
    public static final C22H A09;
    public static final C22H A0A;
    public static final C22H A0B;
    public static final C22H A0C;
    public static final C22H A0D;
    public static final C22H A0E;
    public static final C22H A0F;
    public static final C22H A0G;
    public final int code;
    public final AnonymousClass292 context;
    public final AnonymousClass293 mode;
    public final C2JI scope;

    static {
        C2JI c2ji = C2JI.SIDELIST;
        C2JI c2ji2 = C2JI.PHONEBOOK;
        AnonymousClass292 anonymousClass292 = AnonymousClass292.NOTIFICATION;
        AnonymousClass292 anonymousClass2922 = AnonymousClass292.BACKGROUND;
        AnonymousClass293 anonymousClass293 = AnonymousClass293.FULL;
        AnonymousClass293 anonymousClass2932 = AnonymousClass293.DELTA;
        C2JI c2ji3 = C2JI.DEVICES;
        C2JI c2ji4 = C2JI.PHONEBOOK_AND_SIDELIST;
        AnonymousClass292 anonymousClass2923 = AnonymousClass292.INTERACTIVE;
        AnonymousClass293 anonymousClass2933 = AnonymousClass293.QUERY;
        C22H c22h = new C22H("REGISTRATION_FULL", 0, AnonymousClass292.REGISTRATION, anonymousClass293, c2ji4, 0);
        A0F = c22h;
        C22H c22h2 = new C22H("INTERACTIVE_FULL", 1, anonymousClass2923, anonymousClass293, c2ji4, 1);
        A07 = c22h2;
        C22H c22h3 = new C22H("INTERACTIVE_DELTA", 2, anonymousClass2923, anonymousClass2932, c2ji4, 2);
        A05 = c22h3;
        C22H c22h4 = new C22H("BACKGROUND_FULL", 3, anonymousClass2922, anonymousClass293, c2ji4, 3);
        A04 = c22h4;
        C22H c22h5 = new C22H("BACKGROUND_DELTA", 4, anonymousClass2922, anonymousClass2932, c2ji4, 4);
        A02 = c22h5;
        C22H c22h6 = new C22H("NOTIFICATION_CONTACT", 5, anonymousClass292, anonymousClass2932, c2ji2, 5);
        A0C = c22h6;
        C22H c22h7 = new C22H("INTERACTIVE_QUERY", 6, anonymousClass2923, anonymousClass2933, c2ji2, 6);
        A08 = c22h7;
        C22H c22h8 = new C22H("NOTIFICATION_SIDELIST", 7, anonymousClass292, anonymousClass2933, c2ji, 7);
        A0E = c22h8;
        C22H c22h9 = new C22H("INTERACTIVE_DELTA_SIDELIST", 8, anonymousClass2923, anonymousClass2932, c2ji, 8);
        A06 = c22h9;
        C22H c22h10 = new C22H("ADD_QUERY", 9, AnonymousClass292.ADD, anonymousClass2933, c2ji2, 9);
        A01 = c22h10;
        C22H c22h11 = new C22H("INTERACTIVE_QUERY_DEVICES", 10, anonymousClass2923, anonymousClass2933, c2ji3, 10);
        A09 = c22h11;
        C22H c22h12 = new C22H("MESSAGE_QUERY_DEVICES", 11, AnonymousClass292.MESSAGE, anonymousClass2933, c2ji3, 11);
        A0B = c22h12;
        C22H c22h13 = new C22H("NOTIFICATION_DEVICE", 12, anonymousClass292, anonymousClass2933, c2ji3, 12);
        A0D = c22h13;
        C22H c22h14 = new C22H("BACKGROUND_DEVICE", 13, anonymousClass2922, anonymousClass2933, c2ji3, 13);
        A03 = c22h14;
        C22H c22h15 = new C22H("INTERACTIVE_QUERY_PAYMENT", 14, anonymousClass2923, anonymousClass2933, C2JI.PAYMENT, 14);
        A0A = c22h15;
        C22H c22h16 = new C22H("VOIP_QUERY_DEVICES", 15, AnonymousClass292.VOIP, anonymousClass2933, c2ji3, 15);
        A0G = c22h16;
        A00 = new C22H[]{c22h, c22h2, c22h3, c22h4, c22h5, c22h6, c22h7, c22h8, c22h9, c22h10, c22h11, c22h12, c22h13, c22h14, c22h15, c22h16};
    }

    public C22H(String str, int i, AnonymousClass292 anonymousClass292, AnonymousClass293 anonymousClass293, C2JI c2ji, int i2) {
        this.context = anonymousClass292;
        this.mode = anonymousClass293;
        this.scope = c2ji;
        this.code = i2;
    }

    public static C22H valueOf(String str) {
        return (C22H) Enum.valueOf(C22H.class, str);
    }

    public static C22H[] values() {
        return (C22H[]) A00.clone();
    }
}
