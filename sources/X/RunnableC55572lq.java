package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.2lq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55572lq extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View.OnClickListener A02;
    public final /* synthetic */ View.OnClickListener A03;
    public final /* synthetic */ C639131i A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ RunnableC55572lq(C639131i c639131i, int i, boolean z, String str, View.OnClickListener onClickListener, int i2, View.OnClickListener onClickListener2) {
        this.A04 = c639131i;
        this.A00 = i;
        this.A06 = z;
        this.A05 = str;
        this.A02 = onClickListener;
        this.A01 = i2;
        this.A03 = onClickListener2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C639131i c639131i = this.A04;
        int i = this.A00;
        boolean z = this.A06;
        String str = this.A05;
        View.OnClickListener onClickListener = this.A02;
        int i2 = this.A01;
        View.OnClickListener onClickListener2 = this.A03;
        if (i == 1) {
            if (!z) {
                return;
            }
            Log.i("settings-gdrive/set-message/show-nothing");
            SettingsGoogleDrive settingsGoogleDrive = c639131i.A03;
            settingsGoogleDrive.A0A.setVisibility(8);
            settingsGoogleDrive.A0D.setVisibility(8);
            settingsGoogleDrive.A0B.setVisibility(8);
            settingsGoogleDrive.A0C.setVisibility(8);
            settingsGoogleDrive.A0G.setVisibility(8);
        } else if (i == 2) {
            if (z) {
                Log.i("settings-gdrive/set-message/show-backup-button");
                SettingsGoogleDrive settingsGoogleDrive2 = c639131i.A03;
                settingsGoogleDrive2.A0A.setVisibility(0);
                settingsGoogleDrive2.A0D.setVisibility(8);
                settingsGoogleDrive2.A0B.setVisibility(8);
                settingsGoogleDrive2.A0C.setVisibility(8);
                settingsGoogleDrive2.A0G.setVisibility(8);
                settingsGoogleDrive2.A0A.setOnClickListener(settingsGoogleDrive2.A03);
                settingsGoogleDrive2.A1T();
            }
            if (str == null) {
                return;
            }
            throw new IllegalArgumentException("message should be null when button has to be displayed.");
        } else if (i != 3) {
            if (i == 4) {
                if (str != null) {
                    if (z) {
                        SettingsGoogleDrive settingsGoogleDrive3 = c639131i.A03;
                        settingsGoogleDrive3.A0A.setVisibility(8);
                        settingsGoogleDrive3.A0D.setVisibility(0);
                        settingsGoogleDrive3.A0D.setIndeterminate(true);
                        settingsGoogleDrive3.A0B.setOnClickListener(onClickListener);
                        ImageView imageView = settingsGoogleDrive3.A0B;
                        if (onClickListener != null) {
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                        }
                        ImageView imageView2 = settingsGoogleDrive3.A0C;
                        if (onClickListener2 != null) {
                            imageView2.setVisibility(0);
                        } else {
                            imageView2.setVisibility(8);
                        }
                        settingsGoogleDrive3.A0C.setOnClickListener(onClickListener2);
                        settingsGoogleDrive3.A0G.setVisibility(0);
                    }
                    C000200d.A14("settings-gdrive/set-message ", str);
                    c639131i.A03.A0G.setText(str);
                    return;
                }
                throw null;
            }
        } else if (str != null) {
            if (z) {
                Log.i("settings-gdrive/set-message/show-determinate");
                SettingsGoogleDrive settingsGoogleDrive4 = c639131i.A03;
                settingsGoogleDrive4.A0A.setVisibility(8);
                settingsGoogleDrive4.A0D.setVisibility(0);
                settingsGoogleDrive4.A0D.setIndeterminate(false);
                settingsGoogleDrive4.A0B.setOnClickListener(onClickListener);
                ImageView imageView3 = settingsGoogleDrive4.A0B;
                if (onClickListener != null) {
                    imageView3.setVisibility(0);
                } else {
                    imageView3.setVisibility(8);
                }
                settingsGoogleDrive4.A0G.setVisibility(0);
            }
            if (i2 >= 0) {
                c639131i.A03.A0D.setProgress(i2);
            }
            SettingsGoogleDrive settingsGoogleDrive5 = c639131i.A03;
            settingsGoogleDrive5.A0G.setText(str);
            settingsGoogleDrive5.A0C.setOnClickListener(onClickListener2);
            ImageView imageView4 = settingsGoogleDrive5.A0C;
            if (onClickListener2 != null) {
                imageView4.setVisibility(0);
            } else {
                imageView4.setVisibility(8);
            }
        } else {
            throw null;
        }
    }
}
