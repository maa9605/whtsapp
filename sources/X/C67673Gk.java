package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcelable;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Gk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67673Gk extends C0HS {
    public final int A00;
    public final long A01;
    public final AbstractC000600i A02;
    public final C012005w A03;
    public final C018508q A04;
    public final C03010Du A05;
    public final C018608r A06;
    public final C001200o A07;
    public final C002301c A08;
    public final C44011yN A09;
    public final C40081rY A0A;
    public final AnonymousClass011 A0B;
    public final C2Gx A0C;
    public final C41491u0 A0D;
    public final C455322l A0E;
    public final AnonymousClass092 A0F;
    public final C43791xz A0G;
    public final C41961un A0H;
    public final WeakReference A0I;
    public final Collection A0J;
    public final HashSet A0K;
    public final List A0L;
    public final List A0M;
    public final Map A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public static int A00(int i) {
        if (i == 2 || i == 10 || i == 11) {
            return 4;
        }
        switch (i) {
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
            case 17:
                return 5;
            default:
                return 0;
        }
    }

    public C67673Gk(C001200o c001200o, C018508q c018508q, AbstractC000600i abstractC000600i, C03010Du c03010Du, C012005w c012005w, AnonymousClass011 anonymousClass011, C40081rY c40081rY, C018608r c018608r, C455322l c455322l, C41491u0 c41491u0, C44011yN c44011yN, C41961un c41961un, C002301c c002301c, C43791xz c43791xz, MediaComposerActivity mediaComposerActivity, List list, List list2, Collection collection, C2Gx c2Gx, AnonymousClass092 anonymousClass092, long j, boolean z, int i, boolean z2, Map map, HashSet hashSet, boolean z3) {
        this.A0I = new WeakReference(mediaComposerActivity);
        this.A07 = c001200o;
        this.A04 = c018508q;
        this.A02 = abstractC000600i;
        this.A05 = c03010Du;
        this.A03 = c012005w;
        this.A0B = anonymousClass011;
        this.A0A = c40081rY;
        this.A06 = c018608r;
        this.A0E = c455322l;
        this.A0D = c41491u0;
        this.A0H = c41961un;
        this.A08 = c002301c;
        this.A0G = c43791xz;
        this.A0L = list;
        this.A0M = list2;
        this.A0J = collection;
        this.A0C = c2Gx;
        this.A0F = anonymousClass092;
        this.A01 = j;
        this.A0O = z;
        this.A00 = i;
        this.A0P = z2;
        this.A0N = map;
        this.A0K = hashSet;
        this.A0Q = z3;
        this.A09 = c44011yN;
    }

    public static final List A01(Bitmap bitmap, C2EK c2ek) {
        float f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c2ek.A04) {
            if (obj instanceof C3La) {
                arrayList.add(obj);
            }
        }
        Throwable th = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        RectF rectF = c2ek.A01;
        float f2 = c2ek.A00;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Matrix A00 = C2EK.A00(width, height, f2, rectF.width(), rectF.height(), false, false);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3La c3La = (C3La) it.next();
            PointF pointF = new PointF(width, height);
            if (c3La != null) {
                RectF rectF2 = ((C2HG) c3La).A03;
                rectF2.sort();
                Matrix matrix = new Matrix();
                matrix.preConcat(A00);
                matrix.preTranslate(-rectF.left, -rectF.top);
                matrix.preRotate(((C2HG) c3La).A00, rectF2.centerX(), rectF2.centerY());
                float f3 = rectF2.left;
                float f4 = rectF2.top;
                float f5 = rectF2.right;
                float f6 = rectF2.bottom;
                float[] fArr = {f3, f4, f5, f4, f5, f6, f3, f6};
                matrix.mapPoints(fArr);
                double d = fArr[0] / pointF.x;
                float f7 = fArr[1];
                float f8 = pointF.y;
                arrayList2.add(new InteractiveAnnotation(c3La.A00, c3La.A01, c3La.A06, new SerializablePoint[]{new SerializablePoint(d, f7 / f8), new SerializablePoint(fArr[2] / f, fArr[3] / f8), new SerializablePoint(fArr[4] / f, fArr[5] / f8), new SerializablePoint(fArr[6] / f, fArr[7] / f8)}));
                th = null;
            } else {
                throw th;
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x031a, code lost:
        if (r7 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04f1, code lost:
        if (r7 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020c, code lost:
        if (r12 == null) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0529 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r34) {
        /*
            Method dump skipped, instructions count: 1599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67673Gk.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A0I.get();
        if (mediaComposerActivity != null) {
            C018508q c018508q = mediaComposerActivity.A07;
            c018508q.A02.removeCallbacks(mediaComposerActivity.A19);
            if (mediaComposerActivity.getIntent().getBooleanExtra("send", true) && (mediaComposerActivity.AAl().size() > 1 || mediaComposerActivity.AAl().contains(C04580Kz.A00))) {
                mediaComposerActivity.A1L(mediaComposerActivity.AAl());
            }
            Iterator<? extends Parcelable> it = arrayList.iterator();
            while (it.hasNext()) {
                mediaComposerActivity.A1D.remove(it.next());
            }
            mediaComposerActivity.A1R();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.putStringArrayListExtra("jids", C003101m.A0E(mediaComposerActivity.AAl()));
            mediaComposerActivity.A00 = -1;
            mediaComposerActivity.setResult(-1, intent);
            int intExtra = mediaComposerActivity.getIntent().getIntExtra("product_origin", -1);
            if (mediaComposerActivity.getIntent().getBooleanExtra("smb_send_product", false) && intExtra == 3) {
                mediaComposerActivity.A07.A07(R.string.product_message_sent, 0);
            }
            if (mediaComposerActivity.getIntent().getBooleanExtra("start_home", false)) {
                mediaComposerActivity.A16(HomeActivity.A01(mediaComposerActivity), true);
            } else {
                mediaComposerActivity.finish();
            }
        }
    }

    public void A0A(int i) {
        C018508q c018508q = this.A04;
        c018508q.A02.post(new RunnableEBaseShape1S0102000_I1(this, i, 0, 1));
    }
}
