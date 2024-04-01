package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.3BI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3BI extends C0TS implements View.OnClickListener {
    public C61052vW A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ GalleryPickerFragment A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3BI(GalleryPickerFragment galleryPickerFragment, View view) {
        super(view);
        this.A05 = galleryPickerFragment;
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.title);
        this.A01 = (ImageView) view.findViewById(R.id.icon);
        this.A03 = (TextView) view.findViewById(R.id.count);
        this.A02 = (ImageView) view.findViewById(R.id.thumbnail);
        view.setOnClickListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r1 == 6) goto L15;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            X.2vW r5 = r10.A00
            com.whatsapp.gallerypicker.GalleryPickerFragment r0 = r10.A05
            X.0At r3 = r0.A09()
            int r8 = r5.A02
            r4 = 4
            java.lang.String r6 = "bucketId"
            r0 = 9
            r2 = 0
            r7 = 1
            if (r8 == r0) goto Lc6
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            if (r8 < r4) goto L25
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r0 = r5.A04
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r6, r0)
            android.net.Uri r1 = r0.build()
        L25:
            android.content.Intent r9 = r3.getIntent()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r0, r1)
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "window_title"
            r6.putExtra(r0, r1)
            int r1 = r5.A02
            r0 = 2
            if (r1 == 0) goto Lc4
            if (r1 == r7) goto L4a
            if (r1 == r0) goto L49
            if (r1 == r4) goto Lc4
            r0 = 5
            if (r1 == r0) goto L4a
            r0 = 6
            r4 = 7
            if (r1 != r0) goto L4a
        L49:
            r4 = 2
        L4a:
            int r1 = r5.A01
            r1 = r1 & r4
            java.lang.String r0 = "include_media"
            r6.putExtra(r0, r1)
            java.lang.String r1 = "preview"
            boolean r0 = r9.getBooleanExtra(r1, r7)
            r6.putExtra(r1, r0)
            java.lang.String r8 = "quoted_message_row_id"
            r4 = 0
            long r0 = r9.getLongExtra(r8, r4)
            r6.putExtra(r8, r0)
            java.lang.String r1 = "quoted_group_jid"
            java.lang.String r0 = r9.getStringExtra(r1)
            r6.putExtra(r1, r0)
            java.lang.String r1 = "jid"
            java.lang.String r0 = r9.getStringExtra(r1)
            r6.putExtra(r1, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r1 = "max_items"
            int r0 = r9.getIntExtra(r1, r0)
            r6.putExtra(r1, r0)
            java.lang.String r1 = "is_in_multi_select_mode_only"
            boolean r0 = r9.getBooleanExtra(r1, r2)
            r6.putExtra(r1, r0)
            java.lang.String r1 = "android.intent.extra.TEXT"
            java.lang.String r0 = r9.getStringExtra(r1)
            r6.putExtra(r1, r0)
            java.lang.String r1 = "mentions"
            java.util.ArrayList r0 = r9.getStringArrayListExtra(r1)
            r6.putExtra(r1, r0)
            java.lang.Class<com.whatsapp.gallerypicker.MediaPicker> r0 = com.whatsapp.gallerypicker.MediaPicker.class
            r6.setClass(r3, r0)
            java.lang.String r8 = "picker_open_time"
            long r0 = r9.getLongExtra(r8, r4)
            r6.putExtra(r8, r0)
            java.lang.String r1 = "origin"
            int r0 = r9.getIntExtra(r1, r7)
            r6.putExtra(r1, r0)
            X.0FK[] r0 = new X.C0FK[r2]
            X.0cN r0 = X.C08950cN.A00(r3, r0)
            android.os.Bundle r0 = r0.A01()
            r3.startActivityForResult(r6, r2, r0)
            return
        Lc4:
            r4 = 1
            goto L4a
        Lc6:
            android.net.Uri r0 = X.C3KG.A00
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = r5.A04
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r6, r0)
            android.net.Uri r1 = r0.build()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BI.onClick(android.view.View):void");
    }
}
