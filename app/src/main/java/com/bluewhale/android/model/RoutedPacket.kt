package com.bluewhale.android.model

import com.bluewhale.android.protocol.BluewhalePacket

/**
 * Represents a routed packet with additional metadata
 * Used for processing and routing packets in the mesh network
 */
data class RoutedPacket(
    val packet: BluewhalePacket,
    val peerID: String? = null,           // Who sent it (parsed from packet.senderID)
    val relayAddress: String? = null,     // Address it came from (for avoiding loopback)
    val transferId: String? = null        // Optional stable transfer ID for progress tracking
)
