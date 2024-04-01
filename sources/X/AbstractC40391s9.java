package X;

import android.content.ContentProvider;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.registration.directmigration.MigrationContentProvider;
import com.whatsapp.stickers.WhitelistPackQueryContentProvider;

/* renamed from: X.1s9 */
/* loaded from: classes2.dex */
public abstract class AbstractC40391s9 extends ContentProvider {
    public final C001700t A00 = C001700t.A00();

    public String A00() {
        return !(this instanceof WhitelistPackQueryContentProvider) ? getClass().getSimpleName() : "WhitelistPackQuery";
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        C001700t c001700t = this.A00;
        if (c001700t != null) {
            if (this instanceof MigrationContentProvider) {
                MigrationContentProvider migrationContentProvider = (MigrationContentProvider) this;
                C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(migrationContentProvider.getContext());
                migrationContentProvider.A01 = c0c5.A0M();
                migrationContentProvider.A00 = c0c5.A0J();
                migrationContentProvider.A02 = c0c5.A0Q();
                migrationContentProvider.A03 = c0c5.A0b();
                migrationContentProvider.A09 = c0c5.A1e();
                migrationContentProvider.A08 = c0c5.A1b();
                migrationContentProvider.A07 = c0c5.A1a();
                migrationContentProvider.A06 = c0c5.A0s();
                migrationContentProvider.A05 = c0c5.A0g();
                migrationContentProvider.A04 = c0c5.A0f();
                z = true;
            } else if (this instanceof MediaProvider) {
                MediaProvider mediaProvider = (MediaProvider) this;
                C0C5 c0c52 = (C0C5) AnonymousClass029.A0X(mediaProvider.getContext());
                mediaProvider.A03 = c0c52.A0d();
                mediaProvider.A00 = c0c52.A0J();
                mediaProvider.A01 = c0c52.A0W();
                mediaProvider.A02 = c0c52.A0Y();
                mediaProvider.A04 = c0c52.A0h();
                mediaProvider.A06 = c0c52.A0n();
                mediaProvider.A07 = c0c52.A0q();
                mediaProvider.A08 = c0c52.A11();
                mediaProvider.A05 = c0c52.A0m();
                mediaProvider.A09 = c0c52.A1m();
                z = true;
            } else {
                z = true;
            }
            if (c001700t != null) {
                return z;
            }
            throw null;
        }
        throw null;
    }
}
