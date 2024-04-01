package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.2W0 */
/* loaded from: classes2.dex */
public class C2W0 extends C2W1 {
    public FrameLayout A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public SharedFilePreviewDialogFragment A05;
    public C02E A06;
    public C002301c A07;
    public InterfaceC002901k A08;

    public C2W0(Context context) {
        super(context);
    }

    public void A00(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment, File file, String str, Uri uri) {
        long j;
        int i;
        this.A05 = sharedFilePreviewDialogFragment;
        ActivityC02330At A09 = sharedFilePreviewDialogFragment.A09();
        if (A09 == null) {
            return;
        }
        A09.getLayoutInflater().inflate(R.layout.file_data_view, (ViewGroup) this, true);
        this.A04 = (LinearLayout) findViewById(R.id.display);
        this.A00 = (FrameLayout) findViewById(R.id.image_frame_layout);
        this.A02 = (ImageView) findViewById(R.id.image);
        this.A03 = (ImageView) findViewById(R.id.overlay);
        this.A01 = (ImageView) findViewById(R.id.icon);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A04.setClipToOutline(true);
        }
        this.A03.setVisibility(8);
        onConfigurationChanged(getResources().getConfiguration());
        if (file != null) {
            j = file.length();
        } else {
            j = 0;
        }
        String A0k = C02180Ae.A0k(this.A07, j);
        String A07 = C460324r.A07(this.A06, uri);
        String upperCase = C41961un.A0T(str).toUpperCase(this.A07.A0I());
        if (upperCase.isEmpty()) {
            upperCase = sharedFilePreviewDialogFragment.A0F(R.string.unknown_document_type);
        }
        try {
            i = C460324r.A00(str, file);
        } catch (C72463a2 e) {
            Log.e("shareddocumentpreview/malformed document", e);
            i = 0;
        }
        String A092 = C460324r.A09(this.A07, str, i);
        TextView textView = (TextView) findViewById(R.id.file_name);
        TextView textView2 = (TextView) findViewById(R.id.page_count);
        View findViewById = findViewById(R.id.bullet);
        TextView textView3 = (TextView) findViewById(R.id.file_type);
        C003301p.A06(textView);
        textView.setText(A07);
        ((TextView) findViewById(R.id.file_size)).setText(A0k);
        boolean isEmpty = A092.isEmpty();
        if (!isEmpty) {
            textView2.setVisibility(0);
            textView2.setText(A092);
        } else {
            textView2.setVisibility(8);
        }
        boolean isEmpty2 = upperCase.isEmpty();
        if (!isEmpty2) {
            textView3.setVisibility(0);
            textView3.setText(upperCase);
        } else {
            textView3.setVisibility(8);
        }
        if (!isEmpty && !isEmpty2) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        findViewById.setContentDescription("");
        this.A08.ARy(new C0HS(file, str, this) { // from class: X.375
            public int A00;
            public int A01;
            public final File A02;
            public final String A03;
            public final WeakReference A04;

            {
                this.A02 = file;
                this.A03 = str;
                this.A04 = new WeakReference(this);
                this.A00 = this.A05.A01().getDimensionPixelSize(R.dimen.file_preview_thumbnail_height);
                this.A01 = this.A05.A01().getDimensionPixelSize(R.dimen.file_preview_thumbnail_width);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                String str2 = this.A03;
                if ("application/pdf".equals(str2)) {
                    return C460324r.A02(this.A02.getAbsolutePath(), this.A01, this.A00, true);
                }
                byte[] A0C = C460324r.A0C(str2, this.A02);
                if (A0C != null) {
                    return BitmapFactory.decodeByteArray(A0C, 0, A0C.length);
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C2W0 c2w0 = (C2W0) this.A04.get();
                if (c2w0 != null) {
                    int i2 = this.A00;
                    ViewGroup.LayoutParams layoutParams = c2w0.A02.getLayoutParams();
                    ViewGroup.LayoutParams layoutParams2 = c2w0.A02.getLayoutParams();
                    if (bitmap != null) {
                        layoutParams.height = i2;
                        layoutParams2.height = i2;
                        c2w0.A00.setClipChildren(true);
                        c2w0.A02.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        c2w0.A02.setImageBitmap(bitmap);
                        c2w0.A03.setVisibility(0);
                        c2w0.A01.setVisibility(8);
                        ImageView imageView = c2w0.A02;
                        imageView.setContentDescription(imageView.getContext().getString(R.string.document_preview));
                    } else {
                        layoutParams.height = -1;
                        layoutParams2.height = -1;
                        c2w0.A00.setClipChildren(false);
                        ActivityC02330At A093 = c2w0.A05.A09();
                        if (A093 != null) {
                            c2w0.A02.setImageDrawable(new C0We(c2w0.A07, C02160Ac.A03(A093, R.drawable.unknown_file_preview_background)));
                            c2w0.A01.setImageDrawable(new C0We(c2w0.A07, C02160Ac.A03(A093, R.drawable.ic_attachment_forward_large)));
                        }
                        c2w0.A02.setContentDescription("");
                    }
                    c2w0.A02.setLayoutParams(layoutParams);
                    c2w0.A03.setLayoutParams(layoutParams2);
                }
            }
        }, new Void[0]);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
        if (layoutParams != null) {
            if (configuration.orientation == 1) {
                layoutParams.height = this.A05.A01().getDimensionPixelSize(R.dimen.file_preview_display_height);
            } else {
                layoutParams.height = -1;
            }
            this.A04.setLayoutParams(layoutParams);
        }
    }
}
