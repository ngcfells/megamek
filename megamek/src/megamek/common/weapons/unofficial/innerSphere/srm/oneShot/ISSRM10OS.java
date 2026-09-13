/*
 * Copyright (c) 2005 - Ben Mazur (bmazur@sev.org)
 * Copyright (C) 2007-2025 The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPL),
 * version 3 or (at your option) any later version,
 * as published by the Free Software Foundation.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * A copy of the GPL should have been included with this project;
 * if not, see <https://www.gnu.org/licenses/>.
 *
 * NOTICE: The MegaMek organization is a non-profit group of volunteers
 * creating free software for the BattleTech community.
 *
 * MechWarrior, BattleMech, `Mech and AeroTech are registered trademarks
 * of The Topps Company, Inc. All Rights Reserved.
 *
 * Catalyst Game Labs and the Catalyst Game Labs logo are trademarks of
 * InMediaRes Productions, LLC.
 *
 * MechWarrior Copyright Microsoft Corporation. MegaMek was created under
 * Microsoft's "Game Content Usage Rules"
 * <https://www.xbox.com/en-US/developers/rules> and it is not endorsed by or
 * affiliated with Microsoft.
 */

package megamek.common.weapons.unofficial.innerSphere.srm.oneShot;

import java.io.Serial;

import megamek.common.SourceBookCode;
import megamek.common.enums.AvailabilityValue;
import megamek.common.enums.Faction;
import megamek.common.enums.TechBase;
import megamek.common.enums.TechRating;
import megamek.common.weapons.srms.SRMWeapon;

/**
 * @author Sebastian Brocks
 * @author NGCFells
 * Based on SRM Rules by Riker of KBS at Solaris7.com.
 * https://drive.google.com/drive/folders/0B5bLPOivte0vdjZ0YVQySDZ2SGc?resourcekey=0-oabxb-hZhk9iZVmeTa9zPQ
 */
public class ISSRM10OS extends SRMWeapon {

    @Serial
    private static final long serialVersionUID = 7983612271649152476L;

    public ISSRM10OS() {
        super();
        name = "SRM 10 (OS)";
        setInternalName("ISSRM10OS");
        addLookupName("ISSRM10 (OS)"); // mtf
        addLookupName("IS SRM 10 (OS)"); // tdb
        addLookupName("OS SRM-10"); // mep
        heat = 6;
        rackSize = 10;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        tonnage = 5.5;
        criticalSlots = 3;
        bv = 12;
        flags = flags.or(F_NO_FIRES).or(F_ONE_SHOT).andNot(F_PROTO_WEAPON);
        cost = 40000;
        shortAV = 8;
        maxRange = RANGE_SHORT;
        rulesRefs = rulesRefs(
              rulesRef(SourceBookCode.TM, 230),
              rulesRef(SourceBookCode.BMM, 103),
              rulesRef(SourceBookCode.CORE, 182),
              rulesRef(SourceBookCode.TW, 113)
        );
        techAdvancement.setTechBase(TechBase.IS)
              .setTechRating(TechRating.C)
              .setAvailability(AvailabilityValue.C, AvailabilityValue.C, AvailabilityValue.D, AvailabilityValue.C)
              //From TM pg 230 - "curious concept that did not so much go extinct in the
              //Succession Wars as fall into general disuse"
              .setISAdvancement(2665, 2676, 3045, DATE_NONE, 3030)
              .setISApproximate(true, false, false, false, false)
              .setPrototypeFactions(Faction.TH)
              .setProductionFactions(Faction.TH)
              .setReintroductionFactions(Faction.FW);
    }
}
