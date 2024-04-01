package X;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* renamed from: X.0k9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12830k9 {
    public final Bundle A00;
    public final CharSequence A01;
    public final String A02;
    public final Set A03;
    public final boolean A04 = true;
    public final CharSequence[] A05;

    public C12830k9(String str, CharSequence charSequence, CharSequence[] charSequenceArr, Bundle bundle, Set set) {
        this.A02 = str;
        this.A01 = charSequence;
        this.A05 = charSequenceArr;
        this.A00 = bundle;
        this.A03 = set;
    }

    public static Bundle A00(Intent intent) {
        Intent intent2;
        if (Build.VERSION.SDK_INT >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            ClipDescription description = clipData.getDescription();
            if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().equals("android.remoteinput.results") && (intent2 = clipData.getItemAt(0).getIntent()) != null) {
                return (Bundle) intent2.getExtras().getParcelable("android.remoteinput.resultsData");
            }
        }
        return null;
    }

    public static RemoteInput[] A01(C12830k9[] c12830k9Arr) {
        int length = c12830k9Arr.length;
        RemoteInput[] remoteInputArr = new RemoteInput[length];
        for (int i = 0; i < length; i++) {
            C12830k9 c12830k9 = c12830k9Arr[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c12830k9.A02).setLabel(c12830k9.A01).setChoices(c12830k9.A05).setAllowFreeFormInput(c12830k9.A04).addExtras(c12830k9.A00);
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(0);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
