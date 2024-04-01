package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.SystemClock;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3As  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C66353As extends C0HS {
    public int A00;
    public C0HE A01;
    public final C0C9 A02;
    public final C0IU A03;
    public final C05F A04;
    public final C52602b0 A05;
    public final AbstractC005302j A06;
    public final WeakReference A07;

    public C66353As(C002301c c002301c, C0C9 c0c9, C05F c05f, GalleryFragmentBase galleryFragmentBase, AbstractC005302j abstractC005302j, C0IU c0iu) {
        this.A02 = c0c9;
        this.A04 = c05f;
        this.A07 = new WeakReference(galleryFragmentBase);
        this.A06 = abstractC005302j;
        this.A03 = c0iu;
        this.A05 = new C52602b0(c002301c);
    }

    @Override // X.C0HS
    public void A03(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A07.get();
        if (galleryFragmentBase != null) {
            for (List list : listArr) {
                StringBuilder sb = new StringBuilder();
                sb.append(galleryFragmentBase.A0G);
                sb.append("/report bucket ");
                sb.append(this.A00);
                sb.append(" ");
                sb.append(list.size());
                Log.i(sb.toString());
                if (this.A00 == 0) {
                    galleryFragmentBase.A0H.clear();
                    ((AbstractC04890Mh) galleryFragmentBase.A09).A01.A00();
                }
                this.A00 = list.size() + this.A00;
                galleryFragmentBase.A0H.addAll(list);
                ((AbstractC04890Mh) galleryFragmentBase.A09).A01.A00();
            }
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        AnonymousClass092 A03;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A07.get();
        if (A04() || galleryFragmentBase == null) {
            return null;
        }
        C0HE c0he = new C0HE();
        synchronized (this) {
            this.A01 = c0he;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                AbstractC005302j abstractC005302j = this.A06;
                Cursor A0y = galleryFragmentBase.A0y(abstractC005302j, this.A03, c0he);
                C52592az c52592az = null;
                while (A0y != null) {
                    try {
                        if (!A0y.moveToNext() || A04()) {
                            break;
                        }
                        if (A0y instanceof C40481sK) {
                            A03 = ((C40481sK) A0y).A00();
                            if (A03 == null) {
                                throw null;
                            }
                        } else {
                            A03 = this.A02.A0H.A03(A0y, abstractC005302j);
                            if (A03 == null) {
                                throw null;
                            }
                        }
                        C52592az A00 = this.A05.A00(A03.A0E);
                        if (c52592az != null) {
                            if (!c52592az.equals(A00)) {
                                arrayList.add(c52592az);
                            }
                            c52592az.count++;
                            if (!arrayList.isEmpty() && 1000 + uptimeMillis < SystemClock.uptimeMillis()) {
                                uptimeMillis = SystemClock.uptimeMillis();
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                arrayList.clear();
                                super.A02.A00(arrayList2);
                            }
                        }
                        A00.count = 0;
                        c52592az = A00;
                        c52592az.count++;
                        if (!arrayList.isEmpty()) {
                            uptimeMillis = SystemClock.uptimeMillis();
                            ArrayList arrayList22 = new ArrayList(arrayList);
                            arrayList.clear();
                            super.A02.A00(arrayList22);
                        }
                    } finally {
                    }
                }
                if (c52592az != null && !A04()) {
                    arrayList.add(c52592az);
                }
                if (!arrayList.isEmpty()) {
                    super.A02.A00(arrayList);
                }
                if (A0y != null) {
                    A0y.close();
                }
                synchronized (this) {
                    this.A01 = null;
                }
                C000200d.A1Q(new StringBuilder(), galleryFragmentBase.A0G, "/all buckets assigned");
                return null;
            } catch (SQLiteDiskIOException e) {
                this.A04.A00(1);
                throw e;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.A01 = null;
                throw th;
            }
        }
    }

    public void A0A() {
        A05(true);
        synchronized (this) {
            C0HE c0he = this.A01;
            if (c0he != null) {
                c0he.A01();
            }
        }
    }
}
