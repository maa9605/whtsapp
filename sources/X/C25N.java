package X;

/* renamed from: X.25N  reason: invalid class name */
/* loaded from: classes2.dex */
public class C25N {
    public final AnonymousClass012 A00;
    public final C44301yq A01;

    public C25N(AnonymousClass012 anonymousClass012, C44301yq c44301yq) {
        this.A00 = anonymousClass012;
        this.A01 = c44301yq;
    }

    public C54002ht A00() {
        C71943Yb c71943Yb = new C71943Yb();
        if (A01("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
            c71943Yb.A04 = this.A01.A0E("STORAGE_USAGE_MEDIA_SIZE");
        }
        if (A01("STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
            C44301yq c44301yq = this.A01;
            c71943Yb.A03 = c44301yq.A0E("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE");
            c71943Yb.A01 = c44301yq.A0D("STORAGE_USAGE_LARGE_FILES_COUNT");
            c71943Yb.A06 = c44301yq.A0G("STORAGE_USAGE_LARGE_FILES_ROW_IDS");
        }
        if (A01("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
            C44301yq c44301yq2 = this.A01;
            c71943Yb.A02 = c44301yq2.A0E("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE");
            c71943Yb.A00 = c44301yq2.A0D("STORAGE_USAGE_FORWARDED_FILES_COUNT");
            c71943Yb.A05 = c44301yq2.A0G("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS");
        }
        return new C54002ht(c71943Yb);
    }

    public final boolean A01(String str) {
        Long A0E = this.A01.A0E(str);
        return A0E != null && this.A00.A05() - A0E.longValue() <= 2592000000L;
    }
}
