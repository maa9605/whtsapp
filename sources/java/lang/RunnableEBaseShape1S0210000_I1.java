package java.lang;

import X.C13460lI;
import X.C3B2;
import X.InterfaceC61212vm;
import android.view.View;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0210000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableEBaseShape1S0210000_I1(Object obj, Object obj2, boolean z, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase;
        switch (this.A03) {
            case 0:
                C3B2 c3b2 = (C3B2) this.A00;
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                boolean z = this.A02;
                if (c3b2.A04() || (mediaGalleryFragmentBase = (MediaGalleryFragmentBase) c3b2.A07.get()) == null) {
                    return;
                }
                mediaGalleryFragmentBase.A00 = c3b2.A01;
                int i = c3b2.A00;
                if (z) {
                    if (i == 0) {
                        abstractCollection.size();
                        mediaGalleryFragmentBase.A0P.addAll(abstractCollection);
                    }
                } else {
                    if (i == 0) {
                        ArrayList arrayList = mediaGalleryFragmentBase.A0P;
                        arrayList.size();
                        arrayList.clear();
                    }
                    abstractCollection.size();
                    c3b2.A00 = abstractCollection.size() + i;
                    mediaGalleryFragmentBase.A0P.addAll(abstractCollection);
                }
                mediaGalleryFragmentBase.A06.A01.A00();
                if (mediaGalleryFragmentBase.A0P.isEmpty()) {
                    return;
                }
                mediaGalleryFragmentBase.A15(false);
                return;
            case 1:
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = (VerticalSwipeDismissBehavior) this.A00;
                C13460lI c13460lI = verticalSwipeDismissBehavior.A05;
                if (c13460lI != null && c13460lI.A0B()) {
                    ((View) this.A01).postOnAnimation(this);
                    return;
                }
                InterfaceC61212vm interfaceC61212vm = verticalSwipeDismissBehavior.A06;
                if (interfaceC61212vm != null) {
                    if (this.A02) {
                        interfaceC61212vm.AJR((View) this.A01);
                        return;
                    } else {
                        interfaceC61212vm.AOa((View) this.A01);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
