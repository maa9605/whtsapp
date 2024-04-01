package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Set;

/* renamed from: X.2it  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54522it extends C0TS {
    public C55072jp A00;
    public AnonymousClass092 A01;
    public String A02;
    public Set A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ LinksGalleryFragment A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54522it(LinksGalleryFragment linksGalleryFragment, View view) {
        super(view);
        this.A0B = linksGalleryFragment;
        this.A07 = (TextView) view.findViewById(R.id.message_text);
        this.A04 = view.findViewById(R.id.message_text_holder);
        this.A05 = view.findViewById(R.id.starred_status);
        this.A06 = (ImageView) view.findViewById(R.id.thumb);
        this.A09 = (TextView) view.findViewById(R.id.title);
        this.A0A = (TextView) view.findViewById(R.id.url);
        this.A08 = (TextView) view.findViewById(R.id.suspicious_link_indicator);
        this.A04.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 4));
        view.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 3));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2vA
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C54522it c54522it = C54522it.this;
                AnonymousClass092 anonymousClass092 = c54522it.A01;
                if (anonymousClass092 == null) {
                    return false;
                }
                LinksGalleryFragment linksGalleryFragment2 = c54522it.A0B;
                if (linksGalleryFragment2.A0z().AEZ()) {
                    linksGalleryFragment2.A0z().AVe(anonymousClass092);
                } else {
                    linksGalleryFragment2.A0z().AV2(anonymousClass092);
                }
                ((GalleryFragmentBase) linksGalleryFragment2).A09.A01();
                return true;
            }
        });
    }
}
