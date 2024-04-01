package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;

/* renamed from: X.3mG */
/* loaded from: classes2.dex */
public abstract class AbstractDialogC79813mG extends C09K {
    public int A00;
    public ProgressBar A01;
    public TextView A02;
    public GoogleDriveRestoreAnimationView A03;
    public final Activity A04;
    public final C0CC A05;
    public final C05E A06;
    public final C2Aa A07;

    @Override // android.app.Dialog
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public AbstractDialogC79813mG(Activity activity, C002301c c002301c, C0CC c0cc, C05E c05e, C2Aa c2Aa) {
        super(activity, c002301c, R.layout.backup_restore, false);
        this.A00 = 0;
        this.A05 = c0cc;
        this.A06 = c05e;
        this.A07 = c2Aa;
        this.A04 = activity;
    }

    public void A00(int i) {
        this.A00 = i;
        if (i == 1) {
            if (this.A03 == null) {
                this.A03 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
            }
            findViewById(R.id.restore_actions_view).setVisibility(8);
            findViewById(R.id.restore_animation_view).setVisibility(0);
            this.A01 = (ProgressBar) findViewById(R.id.progress);
            this.A02 = (TextView) findViewById(R.id.progress_info);
            this.A01.setVisibility(0);
            this.A01.setIndeterminate(true);
            C02180Ae.A18(this.A01, C02160Ac.A00(getContext(), R.color.media_message_progress_determinate));
            this.A02.setVisibility(0);
            this.A03.A00();
        } else if (i == 2) {
            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A03;
            if (googleDriveRestoreAnimationView == null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
                this.A03 = googleDriveRestoreAnimationView;
            }
            googleDriveRestoreAnimationView.A02(false);
            findViewById(R.id.restore_actions_view).setVisibility(8);
            ProgressBar progressBar = this.A01;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(R.id.msgrestore_result_box);
            textView2.setVisibility(0);
            C002301c c002301c = super.A02;
            C05E c05e = this.A06;
            String A0A = c002301c.A0A(R.plurals.gdrive_messages_restored_with_no_media_to_restore, c05e.A01(), Integer.valueOf(c05e.A01()));
            StringBuilder sb = new StringBuilder("restorebackupdialog/after-msgstore-verified/ ");
            sb.append(A0A);
            Log.i(sb.toString());
            textView2.setText(A0A);
            findViewById(R.id.next_btn).setVisibility(0);
        }
    }

    @Override // X.C09K, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.perform_restore).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 13));
        findViewById(R.id.dont_restore).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 14));
        findViewById(R.id.next_btn).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 12));
        A00(bundle == null ? 0 : bundle.getInt("state"));
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
            setTitle(R.string.activity_google_drive_title);
            ((TextView) findViewById(R.id.restore_info)).setText(this.A04.getString(R.string.local_restore_info_calculating, AnonymousClass029.A0U(super.A02, this.A05.A08())));
            return;
        }
        throw null;
    }

    @Override // android.app.Dialog
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A07.A0A();
        Activity activity = this.A04;
        activity.startActivity(EULA.A00(activity));
        return true;
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
