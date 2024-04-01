package X;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.text.Format;
import java.util.Date;

/* renamed from: X.3An  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C66303An {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ MediaGalleryFragmentBase A01;
    public final /* synthetic */ Format A02;

    public /* synthetic */ C66303An(MediaGalleryFragmentBase mediaGalleryFragmentBase, TextView textView, Format format) {
        this.A01 = mediaGalleryFragmentBase;
        this.A00 = textView;
        this.A02 = format;
    }

    public final void A00() {
        boolean A09;
        int i;
        InterfaceC52102a4 AB8;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        TextView textView = this.A00;
        Format format = this.A02;
        int A1G = ((LinearLayoutManager) mediaGalleryFragmentBase.A08.A0S).A1G();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = mediaGalleryFragmentBase.A08;
        long A0G = StickyHeadersRecyclerView.getStickyHeadersAdapter(stickyHeadersRecyclerView).A0G(A1G);
        while (true) {
            A09 = StickyHeadersRecyclerView.A09(A0G);
            if (!A09 || A1G >= stickyHeadersRecyclerView.A0N.A0C() - 1) {
                break;
            }
            A1G++;
            A0G = StickyHeadersRecyclerView.getStickyHeadersAdapter(stickyHeadersRecyclerView).A0G(A1G);
        }
        if (A09) {
            i = StickyHeadersRecyclerView.getStickyHeadersAdapter(stickyHeadersRecyclerView).A0C() - ((C1LE) StickyHeadersRecyclerView.getStickyHeadersAdapter(stickyHeadersRecyclerView).A00).AAR();
        } else {
            i = (int) (A0G & 4294967295L);
        }
        InterfaceC52142a8 interfaceC52142a8 = mediaGalleryFragmentBase.A0E;
        if (interfaceC52142a8 != null && (AB8 = interfaceC52142a8.AB8(i)) != null) {
            textView.setText(format.format(new Date(AB8.A9h())));
        }
    }
}
