package X;

import android.database.Cursor;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3Ar  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66343Ar extends C0HS {
    public C0HE A00;
    public final C0IU A01;
    public final AbstractC005302j A02;
    public final WeakReference A03;

    public C66343Ar(GalleryFragmentBase galleryFragmentBase, AbstractC005302j abstractC005302j, C0IU c0iu) {
        this.A03 = new WeakReference(galleryFragmentBase);
        this.A02 = abstractC005302j;
        this.A01 = c0iu;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A03.get();
        if (A04() || galleryFragmentBase == null) {
            return null;
        }
        C0HE c0he = new C0HE();
        synchronized (this) {
            this.A00 = c0he;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str = galleryFragmentBase.A0G;
            sb.append(str);
            sb.append("/getCursor");
            C0HC c0hc = new C0HC(sb.toString());
            Cursor A0y = galleryFragmentBase.A0y(this.A02, this.A01, c0he);
            c0hc.A01();
            if (A0y != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("/loadInBackground ");
                    sb2.append(A0y.getCount());
                    Log.i(sb2.toString());
                } catch (RuntimeException e) {
                    A0y.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.A00 = null;
            }
            if (!A04() || A0y == null) {
                return A0y;
            }
            A0y.close();
            return null;
        } catch (Throwable th) {
            synchronized (this) {
                this.A00 = null;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa A[EDGE_INSN: B:57:0x00fa->B:38:0x00fa ?: BREAK  , SYNTHETIC] */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66343Ar.A09(java.lang.Object):void");
    }
}
