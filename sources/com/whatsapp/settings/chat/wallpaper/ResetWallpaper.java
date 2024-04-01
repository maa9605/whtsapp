package com.whatsapp.settings.chat.wallpaper;

import X.C3MF;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ResetWallpaper extends C3MF {
    @Override // X.C3MF, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.no_wallpaper);
        Intent intent = new Intent();
        intent.putExtra("is_reset", true);
        setResult(-1, intent);
        finish();
    }
}
