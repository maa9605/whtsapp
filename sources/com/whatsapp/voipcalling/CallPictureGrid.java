package com.whatsapp.voipcalling;

import X.AbstractC04890Mh;
import X.AbstractC52002Zk;
import X.C002301c;
import X.C01B;
import X.C05W;
import X.C0MR;
import X.C0Zn;
import X.C84473tn;
import X.InterfaceC52362ab;
import X.InterfaceC74263cy;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.List;

/* loaded from: classes2.dex */
public class CallPictureGrid extends AbstractC52002Zk {
    public C01B A00;
    public C05W A01;
    public InterfaceC52362ab A02;
    public C002301c A03;
    public C84473tn A04;
    public InterfaceC74263cy A05;

    /* loaded from: classes2.dex */
    public class NonScrollingGridLayoutManager extends StaggeredGridLayoutManager {
        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0SV
        public boolean A1A() {
            return false;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0SV
        public boolean A1B() {
            return false;
        }
    }

    public CallPictureGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A04 = new C84473tn(this, this.A01, this.A03, getHeight());
        setLayoutManager(new NonScrollingGridLayoutManager());
        setAdapter(this.A04);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 != i2) {
            C84473tn c84473tn = this.A04;
            c84473tn.A00 = i2;
            ((AbstractC04890Mh) c84473tn).A01.A00();
        }
    }

    public void setCallInfo(CallInfo callInfo) {
        this.A04.A02 = callInfo;
    }

    public void setCancelListener(InterfaceC74263cy interfaceC74263cy) {
        this.A05 = interfaceC74263cy;
    }

    public void setContacts(List list) {
        C84473tn c84473tn = this.A04;
        if (c84473tn != null) {
            List list2 = c84473tn.A08;
            list2.clear();
            if (list.size() > 8) {
                list = list.subList(0, 8);
            }
            list2.addAll(list);
            ((AbstractC04890Mh) c84473tn).A01.A00();
            return;
        }
        throw null;
    }

    public void setParticipantStatusStringProvider(C0MR c0mr) {
        this.A04.A03 = c0mr;
    }

    public void setPhotoDisplayer(InterfaceC52362ab interfaceC52362ab) {
        this.A02 = interfaceC52362ab;
    }

    public void setPhotoLoader(C0Zn c0Zn) {
        this.A04.A01 = c0Zn;
    }
}
