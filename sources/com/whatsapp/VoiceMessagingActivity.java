package com.whatsapp;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;

/* loaded from: classes.dex */
public class VoiceMessagingActivity extends SearchActionVerificationClientActivity {
    @Override // com.google.android.search.verification.client.SearchActionVerificationClientActivity
    public Class getServiceClass() {
        return VoiceMessagingService.class;
    }
}
