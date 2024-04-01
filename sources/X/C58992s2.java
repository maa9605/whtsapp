package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.List;

/* renamed from: X.2s2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58992s2 extends BaseAdapter {
    public List A00;
    public final C59002s3 A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 85;
    }

    public C58992s2(MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A01 = new C59002s3(this.A02);
    }

    public boolean A00(AnonymousClass094 anonymousClass094) {
        List<AnonymousClass092> list = this.A00;
        if (list != null) {
            for (AnonymousClass092 anonymousClass092 : list) {
                if (anonymousClass092.A0n.equals(anonymousClass094)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        AnonymousClass092 anonymousClass092;
        List list = this.A00;
        if (list != null && (anonymousClass092 = (AnonymousClass092) list.get(i)) != null) {
            return C58832rm.A00(anonymousClass092);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (((X.AbstractActivityC04650Lh) r5).A00 != null) goto L31;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            java.util.List r0 = r6.A00
            if (r0 == 0) goto L89
            java.lang.Object r4 = r0.get(r7)
            X.092 r4 = (X.AnonymousClass092) r4
            if (r4 == 0) goto L89
            r3 = 0
            if (r8 != 0) goto L64
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            X.2rm r1 = r5.A0D
            android.content.Context r0 = r9.getContext()
            X.2Ef r8 = r1.A02(r0, r4)
            android.view.View r0 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.leftMargin = r3
            r0.rightMargin = r3
            r0 = 2131363473(0x7f0a0691, float:1.8346756E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L35
            r0.setPadding(r3, r3, r3, r3)
        L35:
            java.util.HashSet r2 = r5.A0S
            X.094 r1 = r4.A0n
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L4d
            r2.remove(r1)
            boolean r0 = r5.A0M
            r0 = r0 ^ 1
            if (r0 != 0) goto L4d
            boolean r0 = r4.A0j
            r8.A0c(r0)
        L4d:
            X.2s3 r1 = r6.A01
            int r0 = r1.A00
            if (r0 != r7) goto L5a
            int r0 = r1.A01
            r8.A01 = r0
            r1.A04 = r8
        L59:
            return r8
        L5a:
            r8.A01 = r3
            X.2Ef r0 = r1.A04
            if (r0 != r8) goto L59
            r0 = 0
            r1.A04 = r0
            return r8
        L64:
            X.2Ef r8 = (X.AbstractC48182Ef) r8
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r5 = r6.A02
            java.util.HashSet r0 = r5.A0S
            X.094 r2 = r4.A0n
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L7f
            java.util.HashSet r0 = r5.A0R
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L7f
            X.0U0 r1 = r5.A00
            r0 = 0
            if (r1 == 0) goto L80
        L7f:
            r0 = 1
        L80:
            r8.A0X(r4, r0)
            java.util.HashSet r0 = r5.A0R
            r0.remove(r2)
            goto L35
        L89:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58992s2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
