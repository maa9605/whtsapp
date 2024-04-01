package com.whatsapp.settings.chat.wallpaper;

import X.C2PW;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class DefaultWallpaper extends C2PW {
    @Override // X.C2PW, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.default_wallpaper);
        Intent intent = new Intent();
        intent.putExtra("is_default", true);
        setResult(-1, intent);
        finish();
    }
}
