package X;

import android.content.Context;
import com.whatsapp.gallerypicker.PhotoViewPager;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.3Lu */
/* loaded from: classes2.dex */
public class C68763Lu extends PhotoViewPager {
    public final /* synthetic */ MediaViewBaseFragment A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68763Lu(MediaViewBaseFragment mediaViewBaseFragment, Context context) {
        super(context, null);
        this.A00 = mediaViewBaseFragment;
        this.A0W = new C0Z8() { // from class: X.3IH
            @Override // X.C0Z8
            public void AMg(int i) {
            }

            @Override // X.C0Z8
            public void AMh(int i, float f, int i2) {
            }

            {
                C68763Lu.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:87:0x005a, code lost:
                if (r3 != null) goto L13;
             */
            /* JADX WARN: Removed duplicated region for block: B:110:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
            @Override // X.C0Z8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void AMi(int r8) {
                /*
                    Method dump skipped, instructions count: 334
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3IH.AMi(int):void");
            }
        };
        ((PhotoViewPager) this).A04 = new InterfaceC61192vk() { // from class: X.3Hz
            {
                C68763Lu.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
                if (r0.A0A() == false) goto L11;
             */
            @Override // X.InterfaceC61192vk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final int APk(float r3, float r4) {
                /*
                    r2 = this;
                    X.3Lu r0 = X.C68763Lu.this
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = r0.A00
                    X.0At r0 = r1.A0A()
                    boolean r0 = r0.isFinishing()
                    if (r0 != 0) goto L29
                    X.3Lu r0 = r1.A09
                    int r0 = r0.getCurrentItem()
                    java.lang.Object r0 = r1.A11(r0)
                    com.whatsapp.mediaview.PhotoView r0 = r1.A0y(r0)
                    if (r0 == 0) goto L25
                    boolean r0 = r0.A0A()
                    r1 = 1
                    if (r0 != 0) goto L26
                L25:
                    r1 = 0
                L26:
                    r0 = 3
                    if (r1 != 0) goto L2a
                L29:
                    r0 = 0
                L2a:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C68083Hz.APk(float, float):int");
            }
        };
    }
}
