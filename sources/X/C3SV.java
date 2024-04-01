package X;

/* renamed from: X.3SV  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3SV extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C012005w A01;
    public final /* synthetic */ AnonymousClass012 A02;
    public final /* synthetic */ AnonymousClass011 A03;
    public final /* synthetic */ C44301yq A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C3SV(String str, int i, C012005w c012005w, AnonymousClass012 anonymousClass012, C44301yq c44301yq, AnonymousClass011 anonymousClass011) {
        this.A05 = str;
        this.A00 = i;
        this.A01 = c012005w;
        this.A02 = anonymousClass012;
        this.A04 = c44301yq;
        this.A03 = anonymousClass011;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A05;
        int i = this.A00;
        C012005w c012005w = this.A01;
        AnonymousClass012 anonymousClass012 = this.A02;
        C44301yq c44301yq = this.A04;
        AnonymousClass011 anonymousClass011 = this.A03;
        long A02 = AnonymousClass024.A02(c012005w.A0D(), null);
        c44301yq.A0I("STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A02));
        c44301yq.A0I("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME", String.valueOf(anonymousClass012.A05()));
        C09520eE c09520eE = new C09520eE();
        C40731sm.A0e(c09520eE, 2, str, i);
        c09520eE.A05 = Long.valueOf(A02);
        anonymousClass011.A0B(c09520eE, null, false);
    }
}
