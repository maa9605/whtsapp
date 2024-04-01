package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.3rm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83223rm extends C0TS {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C002301c A05;
    public final AnonymousClass011 A06;
    public final StorageUsageMediaPreviewView A07;
    public final StorageUsageMediaPreviewView A08;

    public C83223rm(AnonymousClass011 anonymousClass011, C002301c c002301c, View view) {
        super(view);
        this.A06 = anonymousClass011;
        this.A05 = c002301c;
        this.A00 = C0AT.A0D(view, R.id.forwarded_files_container);
        this.A02 = (TextView) C0AT.A0D(view, R.id.forwarded_files_size_text_view);
        this.A07 = (StorageUsageMediaPreviewView) C0AT.A0D(view, R.id.forwarded_files_preview_view);
        this.A01 = C0AT.A0D(view, R.id.large_files_container);
        this.A04 = (TextView) C0AT.A0D(view, R.id.large_files_title_text_view);
        this.A03 = (TextView) C0AT.A0D(view, R.id.large_files_size_text_view);
        this.A08 = (StorageUsageMediaPreviewView) C0AT.A0D(view, R.id.large_files_preview_view);
        AnonymousClass088.A1U(this.A00);
        AnonymousClass088.A1U(this.A01);
    }
}
