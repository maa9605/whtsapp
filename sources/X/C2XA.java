package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2XA */
/* loaded from: classes2.dex */
public class C2XA extends C2XB implements C2X9 {
    public View A00;
    public View A01;
    public C02F A02;
    public C41771uU A03;
    public C42451vl A04;
    public C43791xz A05;
    public List A06;
    public boolean A07;
    public final ArrayList A08;

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return 0;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        return 0;
    }

    @Override // X.C2W2
    public int getMaxAlbumSize() {
        return 2;
    }

    @Override // X.C2W2
    public int getMinAlbumSize() {
        return 2;
    }

    public C2XA(Context context, AnonymousClass097 anonymousClass097, C43791xz c43791xz) {
        super(context, anonymousClass097);
        this.A08 = new ArrayList();
        this.A05 = c43791xz;
        this.A01 = findViewById(R.id.sticker_bubble_header);
        this.A00 = findViewById(R.id.name_in_group);
        this.A08.add(new C54462im(this, findViewById(R.id.sticker_1)));
        this.A08.add(new C54462im(this, findViewById(R.id.sticker_2)));
    }

    private void A01(boolean z) {
        if (this.A06 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A08;
            if (i >= arrayList.size()) {
                return;
            }
            if (i < this.A06.size()) {
                ((C54462im) arrayList.get(i)).A01((AnonymousClass097) this.A06.get(i), z);
            } else {
                ((C54462im) arrayList.get(i)).A01(null, z);
            }
            i++;
        }
    }

    @Override // X.AbstractC48202Eh
    public int A02() {
        if (this.A01 != null) {
            return this.A01.getBottom() + ((AbstractC48202Eh) this).A0C.getTop();
        }
        return super.A02();
    }

    @Override // X.AbstractC48202Eh
    public int A03() {
        if (this.A07 && this.A01 != null) {
            return this.A01.getPaddingTop() + ((AbstractC48202Eh) this).A0C.getTop();
        }
        return super.A03();
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A01(false);
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        super.A0X(super.getFMessage(), z);
        if (z) {
            A01(false);
        }
        A0k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x000e, code lost:
        if (super.getFMessage() != r6.get(0)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002c, code lost:
        if (((X.AnonymousClass092) r6.get(0)).A0n.A02 != false) goto L32;
     */
    @Override // X.C2W2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0j(java.util.List r6, boolean r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.A06
            r4 = 0
            if (r0 == 0) goto L10
            X.092 r1 = super.getFMessage()
            java.lang.Object r0 = r6.get(r4)
            r3 = 0
            if (r1 == r0) goto L11
        L10:
            r3 = 1
        L11:
            java.lang.Object r0 = r6.get(r4)
            X.092 r0 = (X.AnonymousClass092) r0
            X.094 r0 = r0.A0n
            X.02j r0 = r0.A00
            boolean r0 = X.C003101m.A0U(r0)
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r6.get(r4)
            X.092 r0 = (X.AnonymousClass092) r0
            X.094 r0 = r0.A0n
            boolean r1 = r0.A02
            r0 = 1
            if (r1 == 0) goto L2f
        L2e:
            r0 = 0
        L2f:
            r5.A07 = r0
            int r1 = r6.size()
            r0 = 2
            if (r1 == r0) goto L3e
            java.lang.String r0 = "ConversationRowStickerAlbum/setAlbumMessages improper number of stickers in sticker album"
            com.whatsapp.util.Log.e(r0)
            return
        L3e:
            if (r7 != 0) goto L5b
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L5a
            r2 = 0
        L45:
            int r0 = r6.size()
            if (r2 >= r0) goto L5b
            java.util.List r0 = r5.A06
            java.lang.Object r1 = r0.get(r2)
            java.lang.Object r0 = r6.get(r2)
            if (r1 != r0) goto L5a
            int r2 = r2 + 1
            goto L45
        L5a:
            r7 = 1
        L5b:
            r5.A06 = r6
            java.lang.Object r0 = r6.get(r4)
            X.092 r0 = (X.AnonymousClass092) r0
            super.A0X(r0, r7)
            if (r3 != 0) goto L6a
            if (r7 == 0) goto L6d
        L6a:
            r5.A01(r3)
        L6d:
            r5.A0k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2XA.A0j(java.util.List, boolean):void");
    }

    public final void A0k() {
        if (this.A06 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A08;
            if (i >= arrayList.size()) {
                return;
            }
            if (i < this.A06.size()) {
                C54462im c54462im = (C54462im) arrayList.get(i);
                InterfaceC04690Ll rowsContainer = c54462im.A09.getRowsContainer();
                if (rowsContainer != null && rowsContainer.AEZ()) {
                    c54462im.A00();
                    c54462im.A01.setSelected(rowsContainer.AFX(c54462im.A03));
                } else {
                    View view = c54462im.A01;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }
            i++;
        }
    }

    @Override // X.C2X9
    public void AUy() {
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((C54462im) it.next()).A08.A00();
        }
    }

    @Override // X.AbstractC48202Eh
    public int getBubbleAlpha() {
        if (this.A07) {
            return super.getBubbleAlpha();
        }
        return 0;
    }

    @Override // X.AbstractC48202Eh
    public int getContentWidth() {
        if (this.A07 && super.getFMessage().A0C() == null && this.A01 != null) {
            return this.A00.getMeasuredWidth();
        }
        return super.getContentWidth();
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public AnonymousClass097 getFMessage() {
        return (AnonymousClass097) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_sticker_album_left;
    }

    @Override // X.C2W2, X.AbstractC48182Ef
    public int getMessageCount() {
        List list = this.A06;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_sticker_album_right;
    }
}
