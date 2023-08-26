package io.juancrrn.balancerbankingconnector.domain.exceptions

import io.juancrrn.balancerbankingconnector.domain.valueobjects.PlaidInstitutionId
import io.juancrrn.balancerbankingconnector.domain.valueobjects.UserId

class UserAndInstitutionAlreadyLinkedException(
    val userId: UserId,
    val institutionId: PlaidInstitutionId,
) : DomainException(
    "user_and_institution_already_linked",
    "User \"${userId.id}\" and institution \"${institutionId.id}\" are already linked.",
)
