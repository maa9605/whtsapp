package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: X.1rY */
/* loaded from: classes2.dex */
public class C40081rY {
    public static volatile C40081rY A05;
    public final C01B A02;
    public final C43901yB A03;
    public final C43871y8 A04;
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A00 = new SparseArray();

    public C40081rY(C01B c01b, C43871y8 c43871y8, C43901yB c43901yB) {
        this.A02 = c01b;
        this.A04 = c43871y8;
        this.A03 = c43901yB;
    }

    public static C40081rY A00() {
        if (A05 == null) {
            synchronized (C40081rY.class) {
                if (A05 == null) {
                    C01B A00 = C01B.A00();
                    C43871y8 A002 = C43871y8.A00();
                    if (C43901yB.A01 == null) {
                        synchronized (C43901yB.class) {
                            if (C43901yB.A01 == null) {
                                C43901yB.A01 = new C43901yB(C001200o.A01, AnonymousClass012.A00(), AbstractC000600i.A00(), C002801j.A00(), C0EL.A00(), C43911yC.A00(), AnonymousClass035.A00(), C0E7.A00(), C41451tw.A00(), C000500h.A00());
                            }
                        }
                    }
                    A05 = new C40081rY(A00, A002, C43901yB.A01);
                }
            }
        }
        return A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x014d A[Catch: all -> 0x01d7, TryCatch #3 {, blocks: (B:143:0x000b, B:149:0x0017, B:151:0x0021, B:153:0x0029, B:157:0x0038, B:159:0x0042, B:161:0x0048, B:163:0x0055, B:165:0x005c, B:166:0x005f, B:167:0x0062, B:182:0x00a6, B:184:0x00af, B:235:0x01b7, B:185:0x00b6, B:187:0x00ba, B:189:0x00c4, B:218:0x014d, B:219:0x0153, B:221:0x0163, B:222:0x016a, B:208:0x012a, B:215:0x0147, B:226:0x0175, B:168:0x0067, B:170:0x0076, B:174:0x008b, B:175:0x008d, B:173:0x0087, B:176:0x0090, B:178:0x0094, B:180:0x009f, B:181:0x00a2, B:227:0x0176, B:233:0x01b2, B:245:0x01d4, B:190:0x00ce, B:192:0x00d4, B:194:0x00dc, B:199:0x00f6, B:201:0x00fe, B:202:0x0113, B:203:0x0115, B:212:0x0131, B:214:0x0133, B:196:0x00e2, B:198:0x00ed), top: B:255:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0153 A[Catch: all -> 0x01d7, TryCatch #3 {, blocks: (B:143:0x000b, B:149:0x0017, B:151:0x0021, B:153:0x0029, B:157:0x0038, B:159:0x0042, B:161:0x0048, B:163:0x0055, B:165:0x005c, B:166:0x005f, B:167:0x0062, B:182:0x00a6, B:184:0x00af, B:235:0x01b7, B:185:0x00b6, B:187:0x00ba, B:189:0x00c4, B:218:0x014d, B:219:0x0153, B:221:0x0163, B:222:0x016a, B:208:0x012a, B:215:0x0147, B:226:0x0175, B:168:0x0067, B:170:0x0076, B:174:0x008b, B:175:0x008d, B:173:0x0087, B:176:0x0090, B:178:0x0094, B:180:0x009f, B:181:0x00a2, B:227:0x0176, B:233:0x01b2, B:245:0x01d4, B:190:0x00ce, B:192:0x00d4, B:194:0x00dc, B:199:0x00f6, B:201:0x00fe, B:202:0x0113, B:203:0x0115, B:212:0x0131, B:214:0x0133, B:196:0x00e2, B:198:0x00ed), top: B:255:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.graphics.drawable.BitmapDrawable A01(android.content.Context r14, int r15, X.AbstractC43921yD r16) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40081rY.A01(android.content.Context, int, X.1yD):android.graphics.drawable.BitmapDrawable");
    }

    public Drawable A02(Context context, int i, AbstractC43921yD abstractC43921yD, float f) {
        int[] iArr;
        BitmapDrawable A01 = A01(context, i, abstractC43921yD);
        if (A01 == null) {
            if (!(abstractC43921yD instanceof C43931yF)) {
                iArr = ((C43941yG) abstractC43921yD).A01;
            } else {
                C43931yF c43931yF = (C43931yF) abstractC43921yD;
                int i2 = c43931yF.A01;
                iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Character.codePointAt(c43931yF.A02, i3);
                }
            }
            return new Drawable(iArr, f) { // from class: X.1yJ
                public final float A00;
                public final Paint A01 = new Paint();
                public final int[] A02;

                @Override // android.graphics.drawable.Drawable
                public int getOpacity() {
                    return -1;
                }

                {
                    this.A02 = iArr;
                    this.A00 = f;
                }

                @Override // android.graphics.drawable.Drawable
                public void draw(Canvas canvas) {
                    int width = getBounds().width();
                    int height = getBounds().height();
                    Paint paint = this.A01;
                    paint.setTextSize(width * this.A00);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAlpha(255);
                    paint.setTextAlign(Paint.Align.CENTER);
                    int i4 = width >> 1;
                    int ascent = (int) ((height >> 1) - ((paint.ascent() + paint.descent()) / 2.0f));
                    int[] iArr2 = this.A02;
                    StringBuilder sb = new StringBuilder();
                    for (int i5 : iArr2) {
                        sb.appendCodePoint(i5);
                    }
                    String obj = sb.toString();
                    if (!C0XJ.A00(paint, obj)) {
                        obj = "□";
                    }
                    canvas.drawText(obj, i4, ascent, paint);
                }

                @Override // android.graphics.drawable.Drawable
                public void setAlpha(int i4) {
                    this.A01.setAlpha(i4);
                }

                @Override // android.graphics.drawable.Drawable
                public void setColorFilter(ColorFilter colorFilter) {
                    this.A01.setColorFilter(colorFilter);
                }
            };
        }
        return A01;
    }
}
