package com.facebook.redex;

import X.ActivityC02330At;
import X.C02180Ae;
import X.C0LD;
import X.C51602Xc;
import X.C61122vd;
import X.C72533a9;
import X.C83123rc;
import X.C86553xk;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.provider.MediaStore;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.storage.StorageUsageGallerySortBottomSheet;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.support.Remove;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S0101000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape0S0101000_I0(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent labeledIntent;
        StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment;
        switch (this.A02) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                int i = this.A00;
                long A02 = restoreFromBackupActivity.A0L.A02();
                Log.i(String.format(Locale.ENGLISH, "gdrive-activity/display-msgstore-download-error/%d free space:%d", Integer.valueOf(i), Long.valueOf(A02)));
                if (A02 > 0) {
                    GoogleBackupService googleBackupService = restoreFromBackupActivity.A0G;
                    if (googleBackupService != null) {
                        googleBackupService.A06(10);
                        restoreFromBackupActivity.A1d();
                        return;
                    }
                    throw null;
                }
                return;
            case 1:
                SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) this.A01;
                int i2 = this.A00;
                long A022 = settingsGoogleDrive.A0R.A02();
                StringBuilder sb = new StringBuilder("settings-gdrive/display-media-restore-error/");
                sb.append(i2);
                sb.append(" freeSpace:");
                sb.append(A022);
                Log.i(sb.toString());
                if (A022 > 0) {
                    settingsGoogleDrive.A1U();
                    return;
                }
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                ChangeEphemeralSettingActivity.A00(contactInfoActivity.A0Q, contactInfoActivity, contactInfoActivity.A1e(), this.A00);
                return;
            case 3:
                C51602Xc c51602Xc = (C51602Xc) this.A01;
                int i3 = this.A00;
                if (i3 == 0) {
                    c51602Xc.A04.A04();
                    return;
                } else if (i3 == 1) {
                    c51602Xc.A04.A02();
                    return;
                } else if (i3 == 2) {
                    c51602Xc.A04.A05(c51602Xc.getType());
                    return;
                } else {
                    return;
                }
            case 4:
                C51602Xc c51602Xc2 = (C51602Xc) this.A01;
                int i4 = this.A00;
                if (i4 == 0) {
                    c51602Xc2.A04.A01();
                    return;
                } else if (i4 == 1) {
                    c51602Xc2.A04.A03();
                    return;
                } else {
                    return;
                }
            case 5:
                ((SearchViewModel) this.A01).A0H(this.A00);
                return;
            case 6:
                StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = (StorageUsageGallerySortBottomSheet) this.A01;
                int i5 = this.A00;
                storageUsageGallerySortBottomSheet.A10();
                C86553xk c86553xk = (C86553xk) view;
                if (c86553xk.A00.getVisibility() != 0) {
                    storageUsageGallerySortBottomSheet.A02.setChecked(false);
                    storageUsageGallerySortBottomSheet.A03.setChecked(false);
                    storageUsageGallerySortBottomSheet.A04.setChecked(false);
                    c86553xk.setChecked(true);
                    C83123rc c83123rc = storageUsageGallerySortBottomSheet.A00;
                    if (c83123rc == null || (storageUsageMediaGalleryFragment = c83123rc.A00.A0d) == null || ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A02 == i5) {
                        return;
                    }
                    ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A02 = i5;
                    RecyclerFastScroller recyclerFastScroller = ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0J;
                    boolean z = true;
                    if (i5 != 0 && i5 != 1) {
                        z = false;
                    }
                    recyclerFastScroller.setVisibility(z ? 0 : 8);
                    ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A00 = 0;
                    ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
                    ActivityC02330At A09 = storageUsageMediaGalleryFragment.A09();
                    storageUsageMediaGalleryFragment.A16(false, C61122vd.A01(A09 == null ? null : A09.getContentResolver()));
                    return;
                }
                return;
            case 7:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A01;
                int i6 = this.A00;
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C72533a9(new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI).setType("image/*")));
                if (describeProblemActivity.A0K[i6] != null) {
                    arrayList.add(new C72533a9(new Intent(describeProblemActivity, Remove.class), describeProblemActivity.getString(R.string.title_remove)));
                }
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                Intent intent = ((C72533a9) arrayList.get(0)).A01;
                C0LD.A06(intent);
                arrayList2.add(intent);
                for (int i7 = 1; i7 < size; i7++) {
                    C72533a9 c72533a9 = (C72533a9) arrayList.get(i7);
                    if (c72533a9.A02 == null) {
                        labeledIntent = c72533a9.A01;
                    } else {
                        Intent intent2 = c72533a9.A01;
                        labeledIntent = new LabeledIntent(new Intent().setComponent(intent2.resolveActivity(describeProblemActivity.getPackageManager())).setData(intent2.getData()).putExtras(intent2), describeProblemActivity.getPackageName(), c72533a9.A02, c72533a9.A00);
                    }
                    C0LD.A06(labeledIntent);
                    arrayList2.add(labeledIntent);
                }
                describeProblemActivity.startActivityForResult(C02180Ae.A0H(arrayList2, null, null), i6 | 16);
                return;
            default:
                return;
        }
    }
}
