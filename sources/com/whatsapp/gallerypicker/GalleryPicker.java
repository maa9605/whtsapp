package com.whatsapp.gallerypicker;

import X.AbstractActivityC42601w1;
import X.AbstractC005302j;
import X.AbstractC02800Cx;
import X.C011605s;
import X.C018708s;
import X.C02160Ac;
import X.C02180Ae;
import X.C02820Cz;
import X.C02F;
import X.C05W;
import X.C06C;
import X.C0U1;
import X.C2HC;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GalleryPicker extends AbstractActivityC42601w1 {
    public int A00 = 7;
    public C011605s A01;
    public C05W A02;
    public C018708s A03;
    public C02F A04;

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1) {
                setResult(-1, intent);
                finish();
            } else if (i2 != 2) {
            } else {
                setResult(2);
                finish();
            }
        } else if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            if (getIntent().getBooleanExtra("preview", true)) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        return;
                    }
                    parcelableArrayListExtra = new ArrayList();
                    parcelableArrayListExtra.add(data);
                }
                String stringExtra = getIntent().getStringExtra("jid");
                long longExtra = getIntent().getLongExtra("picker_open_time", 0L);
                long longExtra2 = getIntent().getLongExtra("quoted_message_row_id", 0L);
                String stringExtra2 = getIntent().getStringExtra("quoted_group_jid");
                boolean booleanExtra = getIntent().getBooleanExtra("number_from_url", false);
                Intent intent2 = new Intent(this, MediaComposerActivity.class);
                intent2.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                intent2.putExtra("android.intent.extra.TEXT", (String) null);
                intent2.putExtra("jid", stringExtra);
                intent2.putExtra("jids", (Serializable) null);
                intent2.putExtra("max_items", 0);
                intent2.putExtra("origin", 1);
                if (longExtra <= 0) {
                    longExtra = SystemClock.elapsedRealtime();
                }
                intent2.putExtra("picker_open_time", longExtra);
                intent2.putExtra("send", true);
                intent2.putExtra("quoted_message_row_id", longExtra2);
                intent2.putExtra("quoted_group_jid", stringExtra2);
                intent2.putExtra("number_from_url", booleanExtra);
                intent2.putExtra("media_preview_params", (Bundle) null);
                intent2.putExtra("smb_quick_reply", false);
                intent2.putExtra("start_home", false);
                intent2.putExtra("animate_uri", (Parcelable) null);
                intent2.putExtra("preselected_image_uri", (Parcelable) null);
                intent2.putExtra("scan_for_qr", false);
                startActivityForResult(intent2, 0);
                return;
            }
            setResult(-1, intent);
            finish();
        }
    }

    @Override // X.AbstractActivityC42601w1, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        A0h(5);
        if (C2HC.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            window.requestFeature(12);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setExitTransition(inflateTransition);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setReenterTransition(inflateTransition2);
        }
        super.onCreate(bundle);
        RequestPermissionActivity.A0Q(this, this.A04);
        setTitle(R.string.gallery_picker_label);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
            if (A02 != null) {
                C06C A0A = this.A02.A0A(A02);
                if (A0A.A0C()) {
                    string = getString(R.string.sent_to_group, this.A03.A08(A0A, false));
                } else {
                    string = getString(R.string.sent_to_person, this.A03.A08(A0A, false));
                }
                A1B(string);
            }
            this.A00 = getIntent().getIntExtra("include_media", 7);
            setContentView(R.layout.gallery_picker);
            if (bundle == null) {
                GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
                Bundle bundle2 = new Bundle();
                int i = this.A00;
                if (i == 7) {
                    bundle2.putInt("include", 7);
                } else if (i == 1) {
                    bundle2.putInt("include", 1);
                } else if (i == 4) {
                    bundle2.putInt("include", 4);
                } else if (i == 2) {
                    bundle2.putInt("include", 2);
                }
                galleryPickerFragment.A0P(bundle2);
                AbstractC02800Cx A0N = A0N();
                if (A0N != null) {
                    C02820Cz c02820Cz = new C02820Cz(A0N);
                    c02820Cz.A00(R.id.gallery_picker_layout, galleryPickerFragment);
                    c02820Cz.A04();
                } else {
                    throw null;
                }
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            Uri uri = (Uri) getIntent().getParcelableExtra("bucket_uri");
            if (uri != null) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("include_media", this.A00);
                intent.putExtra("preview", getIntent().getBooleanExtra("preview", true));
                intent.putExtra("quoted_message_row_id", getIntent().getLongExtra("quoted_message_row_id", 0L));
                intent.putExtra("quoted_group_jid", getIntent().getStringExtra("quoted_group_jid"));
                intent.putExtra("jid", getIntent().getStringExtra("jid"));
                intent.putExtra("max_items", getIntent().getIntExtra("max_items", Integer.MAX_VALUE));
                intent.putExtra("is_in_multi_select_mode_only", getIntent().getBooleanExtra("is_in_multi_select_mode_only", false));
                intent.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                intent.putExtra("picker_open_time", getIntent().getLongExtra("picker_open_time", 0L));
                intent.setClass(this, MediaPicker.class);
                startActivityForResult(intent, 0);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        final Intent intent;
        int i = this.A00;
        if (i == 4) {
            intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
            intent.setType("video/*");
        } else if (i == 2) {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/gif");
        } else {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/*");
        }
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        if (size > 0) {
            getMenuInflater().inflate(R.menu.gallery_picker, menu);
            SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
            subMenu.clear();
            subMenu.setIcon(C02180Ae.A0O(this, R.drawable.ic_more_teal, R.color.tealActionBarItemDrawableTint));
            menu.findItem(R.id.default_item).setVisible(false);
            Drawable A03 = C02160Ac.A03(this, R.mipmap.icon);
            if (A03 != null) {
                ArrayList arrayList = new ArrayList(size);
                int i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                int intrinsicHeight = A03.getIntrinsicHeight();
                int i3 = 0;
                do {
                    Drawable loadIcon = queryIntentActivities.get(i3).loadIcon(packageManager);
                    i2 = Math.max(loadIcon.getIntrinsicHeight(), i2);
                    arrayList.add(loadIcon);
                    i3++;
                } while (i3 < size);
                int min = Math.min(intrinsicHeight, i2);
                int i4 = 0;
                do {
                    final ResolveInfo resolveInfo = queryIntentActivities.get(i4);
                    Drawable drawable = (Drawable) arrayList.get(i4);
                    if (drawable instanceof BitmapDrawable) {
                        drawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), min, min, false));
                    }
                    MenuItem add = subMenu.add(resolveInfo.loadLabel(packageManager));
                    add.setIcon(drawable);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: X.2vN
                        {
                            GalleryPicker.this = this;
                        }

                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            GalleryPicker galleryPicker = GalleryPicker.this;
                            Intent intent2 = intent;
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                            galleryPicker.startActivityForResult(intent2, 1);
                            return false;
                        }
                    });
                    i4++;
                } while (i4 < size);
                return true;
            }
            throw null;
        }
        return true;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A01.A03().A00.A07(-1);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
