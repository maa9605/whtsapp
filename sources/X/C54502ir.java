package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;

/* renamed from: X.2ir  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54502ir extends C0TS {
    public C09E A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final /* synthetic */ DocumentsGalleryFragment A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54502ir(DocumentsGalleryFragment documentsGalleryFragment, View view) {
        super(view);
        this.A0A = documentsGalleryFragment;
        this.A04 = (ImageView) view.findViewById(R.id.icon);
        this.A08 = (TextView) view.findViewById(R.id.title);
        this.A05 = (TextView) view.findViewById(R.id.date);
        this.A07 = (TextView) view.findViewById(R.id.size);
        this.A02 = view.findViewById(R.id.bullet_size);
        this.A06 = (TextView) view.findViewById(R.id.info);
        this.A01 = view.findViewById(R.id.bullet_info);
        this.A09 = (TextView) view.findViewById(R.id.type);
        this.A03 = view.findViewById(R.id.starred_status);
        view.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 2));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.2v9
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C54502ir c54502ir = C54502ir.this;
                C09E c09e = c54502ir.A00;
                if (c09e == null) {
                    return false;
                }
                DocumentsGalleryFragment documentsGalleryFragment2 = c54502ir.A0A;
                if (documentsGalleryFragment2.A0z().AEZ()) {
                    documentsGalleryFragment2.A0z().AVe(c09e);
                } else {
                    documentsGalleryFragment2.A0z().AV2(c09e);
                }
                ((GalleryFragmentBase) documentsGalleryFragment2).A09.A01();
                return true;
            }
        });
    }
}
