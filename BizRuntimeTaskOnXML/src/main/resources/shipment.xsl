<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:v1="http://www.ups.com/XMLSchema/XOLTWS/UPSS/v1.0" xmlns:v11="http://www.ups.com/XMLSchema/XOLTWS/Ship/v1.0"
			xmlns:v12="http://www.ups.com/XMLSchema/XOLTWS/Common/v1.0"
			xmlns:v13="http://www.ups.com/XMLSchema/XOLTWS/IF/v1.0">
			<soapenv:Header>
				<v1:UPSSecurity>
					<v1:UsernameToken>
						<v1:Username>
							<xsl:value-of select="Shipment/Shipper/shipper_id"></xsl:value-of>
						</v1:Username>
						<v1:Password>
							<xsl:value-of
								select="Shipment/Service/HostServiceType/HostNaming/NamingType"></xsl:value-of>
						</v1:Password>
					</v1:UsernameToken>
					<v1:ServiceAccessToken>
						<v1:AccessLicenseNumber>
							<xsl:value-of
								select="Shipment/Service/HostServiceType/HostNaming/HostName/Service"></xsl:value-of>
						</v1:AccessLicenseNumber>
					</v1:ServiceAccessToken>
				</v1:UPSSecurity>
			</soapenv:Header>
			<soapenv:Body>
				<v11:ShipmentRequest>
					<xsl:for-each select="//ContactAndAddress">
						<v12:Request>
							<v12:RequestOption>
								<xsl:value-of select="AccountNumber"></xsl:value-of>
							</v12:RequestOption>
							<v12:TransactionReference>
								<v12:CustomerContext>
									<xsl:value-of select="ContactId"></xsl:value-of>
								</v12:CustomerContext>
								<v12:XpciVersion>
									<xsl:value-of select="PostalCode"></xsl:value-of>
								</v12:XpciVersion>
								<v12:TransactionIdentifier>
									<xsl:value-of select="StateOrProvinceCode"></xsl:value-of>
								</v12:TransactionIdentifier>
							</v12:TransactionReference>
						</v12:Request>
					</xsl:for-each>
					<v11:Shipment>
						<v11:Description>
							<xsl:value-of
								select="Shipment/Service/HostServiceType/HostNaming/HostSystem"></xsl:value-of>
						</v11:Description>
						<v11:Shipper>
							<v11:Name>
								<xsl:value-of
									select="Shipment/Service/HostServiceType/HostNaming/HostName/Carrier"></xsl:value-of>
							</v11:Name>
							<v11:AttentionName>
								<xsl:value-of
									select="Shipment/Service/HostServiceType/HostNaming/HostName/Service"></xsl:value-of>
							</v11:AttentionName>
							<v11:Phone>
								<v11:Number>
									<xsl:value-of
										select="Shipment/ShipToAddress/ContactAndAddress/PhoneNumber"></xsl:value-of>
								</v11:Number>
								<v11:Extension>
									<xsl:value-of
										select="Shipment/ShipToAddress/ContactAndAddress/PhoneExtension"></xsl:value-of>
								</v11:Extension>
							</v11:Phone>
							<v11:ShipperNumber>
								<xsl:value-of select="Shipment/Shipper/Shipper_id"></xsl:value-of>
							</v11:ShipperNumber>
							<xsl:for-each
								select="Shipment/AlternateDeliveryAddress/ContactAndAddress">
								<v11:Address>
									<v11:AddressLine>
										<xsl:value-of
											select="concat(StreetLine1,',',StreetLine2,',',StreetLine3)"></xsl:value-of>
									</v11:AddressLine>
									<v11:City>
										<xsl:value-of select="City"></xsl:value-of>
									</v11:City>
									<v11:StateProvinceCode>
										<xsl:value-of select="StateOrProvinceCode"></xsl:value-of>
									</v11:StateProvinceCode>
									<v11:PostalCode>
										<xsl:value-of select="PostalCode"></xsl:value-of>
									</v11:PostalCode>
									<v11:CountryCode>
										<xsl:value-of select="CountryCode"></xsl:value-of>
									</v11:CountryCode>
								</v11:Address>
							</xsl:for-each>
						</v11:Shipper>
						<v11:ShipTo>
							<v11:Name>
								<xsl:value-of
									select="Shipment/ShipToAddress/ContactAndAddress/PersonName"></xsl:value-of>
							</v11:Name>
							<v11:Phone>
								<v11:Number>
									<xsl:value-of
										select="Shipment/ShipToAddress/ContactAndAddress/PhoneNumber"></xsl:value-of>
								</v11:Number>
								<v11:Extension>
									<xsl:value-of
										select="Shipment/ShipToAddress/ContactAndAddress/PhoneExtension"></xsl:value-of>
								</v11:Extension>
							</v11:Phone>
							<v11:AttentionName></v11:AttentionName>
							<xsl:for-each select="Shipment/ShipToAddress/ContactAndAddress">
								<v11:Address>
									<v11:AddressLine>
										<xsl:value-of
											select="concat(StreetLine1,',',StreetLine2,',',StreetLine3)"></xsl:value-of>
									</v11:AddressLine>
									<v11:City>
										<xsl:value-of select="City"></xsl:value-of>
									</v11:City>
									<v11:StateProvinceCode>
										<xsl:value-of select="StateOrProvinceCode"></xsl:value-of>
									</v11:StateProvinceCode>
									<v11:PostalCode>
										<xsl:value-of select="PostalCode"></xsl:value-of>
									</v11:PostalCode>
									<v11:CountryCode>
										<xsl:value-of select="CountryCode"></xsl:value-of>
									</v11:CountryCode>
								</v11:Address>
							</xsl:for-each>
						</v11:ShipTo>
						<v11:ShipFrom>
							<v11:Name>
								<xsl:value-of
									select="Shipment/ShipFromAddress/ContactAndAddress/PersonName"></xsl:value-of>
							</v11:Name>
							<xsl:for-each select="Shipment/ShipFromAddress/ContactAndAddress">
								<v11:Address>
									<v11:AddressLine>
										<xsl:value-of
											select="concat(StreetLine1,',',StreetLine2,',',StreetLine3)"></xsl:value-of>
										<v11:City>
											<xsl:value-of select="City"></xsl:value-of>
										</v11:City>
										<v11:StateProvinceCode>
											<xsl:value-of select="StateOrProvinceCode"></xsl:value-of>
										</v11:StateProvinceCode>
										<v11:PostalCode>
											<xsl:value-of select="PostalCode"></xsl:value-of>
										</v11:PostalCode>
										<v11:CountryCode>
											<xsl:value-of select="CountryCode"></xsl:value-of>
										</v11:CountryCode>
									</v11:AddressLine>
								</v11:Address>
							</xsl:for-each>
						</v11:ShipFrom>
						<v11:PaymentInformation>
							<xsl:variable name="index" select="0" />
							<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge">
								<xsl:if test="$index != 2">
									<v11:ShipmentCharge>
										<v11:Type>
											<xsl:value-of select="Type"></xsl:value-of>
										</v11:Type>
										<v11:BillShipper>
											<v11:AccountNumber>
												<xsl:value-of select="BillShipper/AccountNumber"></xsl:value-of>
											</v11:AccountNumber>
										</v11:BillShipper>
									</v11:ShipmentCharge>
								</xsl:if>
								<xsl:variable name="index" select="$index+1" />
							</xsl:for-each>
						</v11:PaymentInformation>
						<v11:Service>
							<v11:Code>
								<xsl:value-of select="Shipment/Packages/Package/Weight/UnitOfMeasurement/Code"></xsl:value-of>
							</v11:Code>
							<v11:Description>
								<xsl:value-of
									select="Shipment/Packages/Package/Weight/UnitOfMeasurement/Description"></xsl:value-of>
							</v11:Description>
						</v11:Service>
						<v11:ShipmentServiceOptions>
							<xsl:value-of
								select="Shipment/Service/HostServiceType/HostNaming/HostName/Carrier"></xsl:value-of>
						</v11:ShipmentServiceOptions>

						<v11:Package>
							
								<v11:Description>
									<xsl:value-of select="Shipment/Packages/PackageCount"></xsl:value-of>
								</v11:Description>
								<xsl:for-each select="Shipment/Packages/Package">
								<v11:Packaging>
									<v11:Code>
										<xsl:value-of select="PackagingType/Code"></xsl:value-of>
									</v11:Code>
									<v11:Description>
										<xsl:value-of select="PackagingType/Description"></xsl:value-of>
									</v11:Description>
								</v11:Packaging>
								<v11:Dimensions>
									<v11:UnitOfMeasurement>
										<v11:Code>
											<xsl:value-of select="Dimensions/UnitOfMeasurement/Code"></xsl:value-of>
										</v11:Code>
										<v11:Description>
											<xsl:value-of
												select="Dimensions/UnitOfMeasurement/Description"></xsl:value-of>
										</v11:Description>
									</v11:UnitOfMeasurement>
									<v11:Length>
										<xsl:value-of select="Dimensions/Length"></xsl:value-of>
									</v11:Length>
									<v11:Width>
										<xsl:value-of select="Dimensions/Width"></xsl:value-of>
									</v11:Width>
									<v11:Height>
										<xsl:value-of select="Dimensions/Height"></xsl:value-of>
									</v11:Height>
								</v11:Dimensions>
								<v11:PackageWeight>
									<v11:UnitOfMeasurement>
										<v11:Code>
											<xsl:value-of select="Dimensions/UnitOfMeasurement/Code"></xsl:value-of>
										</v11:Code>
										<v11:Description>
											<xsl:value-of
												select="Dimensions/UnitOfMeasurement/Description"></xsl:value-of>
										</v11:Description>
									</v11:UnitOfMeasurement>
									<v11:Weight>
										<xsl:value-of select="Dimensions/Width"></xsl:value-of>
									</v11:Weight>
								</v11:PackageWeight>
								<v11:PackageServiceOptions>
									<xsl:value-of select="Machinable"></xsl:value-of>
								</v11:PackageServiceOptions>
							</xsl:for-each>
						</v11:Package>

					</v11:Shipment>
					<v11:LabelSpecification>
						<v11:LabelImageFormat>
							<v11:Code>
								<xsl:value-of select="Shipment/LabelSpecification/ImageType"></xsl:value-of>
							</v11:Code>
							<v11:Description>
								<xsl:value-of
									select="Shipment/Packages/Package/PackagingType/Description"></xsl:value-of>
							</v11:Description>
						</v11:LabelImageFormat>
						<xsl:for-each select="Shipment/Packages/Package/Dimensions">
							<v11:LabelStockSize>
								<v11:Height>
									<xsl:value-of select="Length"></xsl:value-of>
								</v11:Height>
								<v11:Width>
									<xsl:value-of select="Width"></xsl:value-of>
								</v11:Width>
							</v11:LabelStockSize>
						</xsl:for-each>
					</v11:LabelSpecification>

				</v11:ShipmentRequest>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>

</xsl:stylesheet>