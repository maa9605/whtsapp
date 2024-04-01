package X;

/* renamed from: X.1yi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44221yi extends Thread {
    public final C012005w A00;
    public final C002301c A01;
    public final C40081rY A02;
    public final C43101wr A03;
    public final /* synthetic */ C43801y0 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44221yi(C43801y0 c43801y0, C012005w c012005w, C40081rY c40081rY, C002301c c002301c, C43101wr c43101wr) {
        super("MessageThumbsThread");
        this.A04 = c43801y0;
        this.A00 = c012005w;
        this.A02 = c40081rY;
        this.A01 = c002301c;
        this.A03 = c43101wr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
        if (r7 == null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7 A[Catch: InterruptedException -> 0x020a, TryCatch #0 {InterruptedException -> 0x020a, blocks: (B:3:0x0005, B:4:0x0013, B:6:0x001d, B:8:0x0028, B:10:0x0037, B:12:0x003d, B:14:0x0043, B:16:0x0047, B:18:0x004d, B:20:0x0051, B:100:0x01bd, B:102:0x01c7, B:106:0x01e3, B:21:0x0059, B:23:0x005e, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0074, B:33:0x007a, B:37:0x008d, B:39:0x0091, B:41:0x0095, B:43:0x0099, B:45:0x00a5, B:47:0x00b5, B:49:0x00bb, B:50:0x00c1, B:34:0x0083, B:51:0x00c7, B:53:0x00cb, B:55:0x00d5, B:56:0x00ed, B:58:0x00f1, B:60:0x00fa, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:67:0x0118, B:69:0x011c, B:73:0x0142, B:75:0x0148, B:77:0x0157, B:80:0x015d, B:82:0x0163, B:99:0x01b9, B:87:0x016f, B:89:0x0173, B:91:0x0179, B:93:0x018b, B:95:0x0191, B:98:0x01a7, B:103:0x01d7, B:105:0x01dd, B:108:0x01e9, B:109:0x0202), top: B:114:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e3 A[Catch: InterruptedException -> 0x020a, TryCatch #0 {InterruptedException -> 0x020a, blocks: (B:3:0x0005, B:4:0x0013, B:6:0x001d, B:8:0x0028, B:10:0x0037, B:12:0x003d, B:14:0x0043, B:16:0x0047, B:18:0x004d, B:20:0x0051, B:100:0x01bd, B:102:0x01c7, B:106:0x01e3, B:21:0x0059, B:23:0x005e, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0074, B:33:0x007a, B:37:0x008d, B:39:0x0091, B:41:0x0095, B:43:0x0099, B:45:0x00a5, B:47:0x00b5, B:49:0x00bb, B:50:0x00c1, B:34:0x0083, B:51:0x00c7, B:53:0x00cb, B:55:0x00d5, B:56:0x00ed, B:58:0x00f1, B:60:0x00fa, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:67:0x0118, B:69:0x011c, B:73:0x0142, B:75:0x0148, B:77:0x0157, B:80:0x015d, B:82:0x0163, B:99:0x01b9, B:87:0x016f, B:89:0x0173, B:91:0x0179, B:93:0x018b, B:95:0x0191, B:98:0x01a7, B:103:0x01d7, B:105:0x01dd, B:108:0x01e9, B:109:0x0202), top: B:114:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb A[Catch: InterruptedException -> 0x020a, TryCatch #0 {InterruptedException -> 0x020a, blocks: (B:3:0x0005, B:4:0x0013, B:6:0x001d, B:8:0x0028, B:10:0x0037, B:12:0x003d, B:14:0x0043, B:16:0x0047, B:18:0x004d, B:20:0x0051, B:100:0x01bd, B:102:0x01c7, B:106:0x01e3, B:21:0x0059, B:23:0x005e, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0074, B:33:0x007a, B:37:0x008d, B:39:0x0091, B:41:0x0095, B:43:0x0099, B:45:0x00a5, B:47:0x00b5, B:49:0x00bb, B:50:0x00c1, B:34:0x0083, B:51:0x00c7, B:53:0x00cb, B:55:0x00d5, B:56:0x00ed, B:58:0x00f1, B:60:0x00fa, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:67:0x0118, B:69:0x011c, B:73:0x0142, B:75:0x0148, B:77:0x0157, B:80:0x015d, B:82:0x0163, B:99:0x01b9, B:87:0x016f, B:89:0x0173, B:91:0x0179, B:93:0x018b, B:95:0x0191, B:98:0x01a7, B:103:0x01d7, B:105:0x01dd, B:108:0x01e9, B:109:0x0202), top: B:114:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44221yi.run():void");
    }
}
