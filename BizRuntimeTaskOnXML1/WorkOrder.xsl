<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<Workorder>
			<TenantId>
				<xsl:value-of select="DATA2SC/@PIN" />
			</TenantId>
			<SiteId>
				<xsl:value-of select="DATA2SC/@ID" />
			</SiteId>
			<Id>
				<xsl:value-of select="DATA2SC/@ID" />
			</Id>
			<Provider>
				<Id>
					<xsl:value-of select="DATA2SC/CALL/@EQP_ID"></xsl:value-of>
				</Id>
				<Name>
					<xsl:value-of select="DATA2SC/CALL/@OPERATOR"></xsl:value-of>
				</Name>
				<SourceId>
					<xsl:value-of select="DATA2SC/CALL/@SUB"></xsl:value-of>
				</SourceId>
				<RequestedDate>
					<xsl:value-of select="DATA2SC/CALL/@DATETIME"></xsl:value-of>
				</RequestedDate>
				<ActionDate>
					<xsl:value-of select="DATA2SC/CALL/ATTR/@DATETIME"></xsl:value-of>
				</ActionDate>
				<KVP>
					<xsl:value-of select="DATA2SC/CALL/ATTR/@SoWerxXML1"></xsl:value-of>
				</KVP>
				<SourceProperties>
					<Properties>
						<xsl:attribute name="ProviderStatus">
						<xsl:value-of select="DATA2SC/CALL/@PRO_NAME"></xsl:value-of>
						</xsl:attribute>
					</Properties>
					<Properties>
						<xsl:attribute name="Category">
						<xsl:value-of select="DATA2SC/CALL/@STATUS" />
						</xsl:attribute>
					</Properties>
					<Properties>
						<xsl:attribute name="Trade">
						<xsl:value-of select="DATA2SC/CALL/ATTR/@CREATED_BY"></xsl:value-of>
						</xsl:attribute>
					</Properties>
				</SourceProperties>
			</Provider>
			<Customer>
				<Id>
					<xsl:value-of select="DATA2SC/CALL/ATTR/@LINE"></xsl:value-of>
				</Id>
				<Name>
					<xsl:value-of select="DATA2SC/CALL[@SUB ='2014917018' ]/PROBLEM" />
				</Name>
				<SalespersonId>
					<xsl:value-of select="DATA2SC/CALL/@CURRENCY"></xsl:value-of>
				</SalespersonId>
				<Notes>
					<Note>
						<xsl:for-each select="DATA2SC/CALL">
							<Subject>
								<xsl:value-of select="@TYPE" />
							</Subject>
							<NoteType>
								<xsl:value-of select="PROBLEM" />
							</NoteType>
							<NoteTypeId>
								<xsl:value-of select="@PRO"></xsl:value-of>
							</NoteTypeId>
							<NoteText>
								<xsl:value-of select="ATTR"></xsl:value-of>
							</NoteText>
							<Internal>
								<xsl:value-of select="@RECALL"></xsl:value-of>
							</Internal>
						</xsl:for-each>
					</Note>
				</Notes>
			</Customer>
			<xsl:if test="DATA2SC/CALL[@SUB]">
				<Address>
					<Id>
						<xsl:value-of select="DATA2SC/@PIN"></xsl:value-of>
					</Id>
					<AddressName>
						<xsl:value-of select="DATA2SC/CALL/@TRADE"></xsl:value-of>
					</AddressName>
					<Street1></Street1>
					<Street2></Street2>
					<City></City>
					<State></State>
					<Country></Country>
					<PostalCode></PostalCode>
					<Contacts>
						<Contact>
								<Name>
									<xsl:value-of select="DATA2SC/CALL/@TYPE"></xsl:value-of>
								</Name>
								<Phone>
									<xsl:value-of select="DATA2SC/CALL/@WO_NUM"></xsl:value-of>
								</Phone>
								<Email>
									<xsl:value-of select="DATA2SC/CALL/ATTR/@CREATED_BY"></xsl:value-of>
								</Email>
								<KVP>
									<xsl:value-of select="DATA2SC/CALL/@TYPE"></xsl:value-of>
								</KVP>						
						</Contact>
					</Contacts>
					<Notes>
						<Note>
							<xsl:for-each select="DATA2SC/CALL">
								<Subject>
									<xsl:value-of select="@TYPE" />
								</Subject>
								<NoteType>
									<xsl:value-of select="PROBLEM" />
								</NoteType>
								<NoteTypeId>
									<xsl:value-of select="@PRO"></xsl:value-of>
								</NoteTypeId>
								<NoteText>
									<xsl:value-of select="ATTR"></xsl:value-of>
								</NoteText>
								<Internal>
									<xsl:value-of select="@RECALL"></xsl:value-of>
								</Internal>
							</xsl:for-each>
						</Note>
					</Notes>
					<KVP>
						<xsl:value-of select="@TRADE"></xsl:value-of>
					</KVP>
				</Address>
			</xsl:if>
			<ShipToCustomer></ShipToCustomer>
			<ShipToAddress></ShipToAddress>
			<BillToCustomer></BillToCustomer>
			<BillToAddress></BillToAddress>
			<Division></Division>
			<ScheduledDate>
				<xsl:value-of select="DATA2SC/CALL/@DATETIME" />
			</ScheduledDate>
			<CallStatus>
				<xsl:value-of select="DATA2SC/CALL/@STATUS" />
			</CallStatus>
			<CallType>
				<xsl:value-of select="DATA2SC/CALL/@TYPE" />
			</CallType>
			<CreatedBy>
				<xsl:value-of select="DATA2SC/CALL/ATTR/@CREATED_BY" />
			</CreatedBy>
			<WorkOrderId>
				<xsl:value-of select="DATA2SC/@ID"></xsl:value-of>
			</WorkOrderId>
			<Description>
				<xsl:value-of select="DATA2SC/CALL/ATTR" />
			</Description>
			<CustomerWorkOrder></CustomerWorkOrder>
			<xsl:if test="DATA2SC/CALL/ATTR[@LINE]">
				<CustomerPurchaseOrder>
					<xsl:value-of select="DATA2SC/CALL[@TRADE]"></xsl:value-of>
				</CustomerPurchaseOrder>
			</xsl:if>
			<Priority></Priority>
			<CompletionDate></CompletionDate>
			<Job></Job>
			<OriginatingWorkOrderId></OriginatingWorkOrderId>
			<SalespersonId></SalespersonId>
			<UserDefines>
				<xsl:for-each select="DATA2SC/CALL">
					<UserDefine>
						<KVP>
							<xsl:value-of select="@WO_NUM"></xsl:value-of>
						</KVP>
					</UserDefine>
				</xsl:for-each>
			</UserDefines>
			<Contacts>
				<Contact>
					<xsl:for-each select="DATA2SC/CALL">
						<Id>
							<xsl:value-of select="@PRO"></xsl:value-of>
						</Id>
						<Name>
							<xsl:value-of select="@TRADE"></xsl:value-of>
						</Name>
						<Phone>
							<xsl:value-of select="@WO_NUM"></xsl:value-of>
						</Phone>
						<Email></Email>
						<KVP></KVP>
					</xsl:for-each>
				</Contact>
			</Contacts>
			<Appointments>
				<Appointment>
					<xsl:for-each select="DATA2SC">
						<Id>
							<xsl:value-of select="@ID"></xsl:value-of>
						</Id>
						<Resources>
							<xsl:for-each select="CALL">problem
								<Resource>
									<Id>
										<xsl:value-of select="@PO_NUM"></xsl:value-of>
									</Id>
									<Name>
										<xsl:value-of select="@CATEGORY"></xsl:value-of>
									</Name>
									<ResourceType>
										<xsl:value-of select="@TYPE"></xsl:value-of>
									</ResourceType>
									<KVP>
										<xsl:value-of select="PROBLEM"></xsl:value-of>
									</KVP>
								</Resource>
							</xsl:for-each>
						</Resources>
					</xsl:for-each>
					<StartTime></StartTime>
					<EstimateHours></EstimateHours>
					<Equipments>
						<Equipment>
							<xsl:for-each select="DATA2SC">
								<Id><xsl:value-of select="@PIN"></xsl:value-of></Id>
								<Manufacturer>
									<Id>
										<xsl:value-of select="@ID"></xsl:value-of>
									</Id>
									<Name></Name>
									<Model>
										<Name>
											<xsl:value-of select="CALL/@TYPE"></xsl:value-of>
										</Name>
										<Description>
											<xsl:value-of select="CALL/ATTR"></xsl:value-of>
										</Description>
									</Model>
								</Manufacturer>

							</xsl:for-each>
							<EquipmentType>
								<xsl:value-of select="DATA2SC/CALL/@TYPE" />
							</EquipmentType>
							<SerialNumber>
								<xsl:value-of select="DATA2SC/CALL/@EQP_ID"></xsl:value-of>
							</SerialNumber>
							<Contract>
								<Id></Id>
								<Customer>
									<Id>
										<xsl:value-of select="DATA2SC/@ID" />
									</Id>
									<CustomerId>
										<xsl:value-of select="DATA2SC/@PIN" />
									</CustomerId>
									<CustomerName>
										<xsl:value-of select="DATA2SC/CALL/@TYPE" />
									</CustomerName>
								</Customer>
								<StartDate>
									<xsl:value-of select="DATA2SC/CALL/ATTR/@DATETime"></xsl:value-of>
								</StartDate>
								<EndDate>
									<xsl:value-of select="DATA2SC/CALL/@DATETIME" />
								</EndDate>
								<Type>
									<xsl:value-of select="DATA2SC/CALL/@TYPE" />
								</Type>
								<Status>
									<xsl:value-of select="DATA2SC/CALL/@STATUS" />
								</Status>
								<Amount>
									<xsl:value-of select="DATA2SC/CALL/@NTE"></xsl:value-of>
								</Amount>
							</Contract>
							<Building>
								<Id>
									<xsl:value-of select="DATA2SC/CALL/@WO_NUM" />
								</Id>
								<Name>
									<xsl:value-of select="DATA2SC/CALL/@CATEGORY" />
								</Name>
								<Address>
									<Id>
										<xsl:value-of select="DATA2SC/CALL/@WO_NUM" />
									</Id>
									<Street1>
										<xsl:value-of select="DATA2SC/CALL/PROBLEM" />
									</Street1>
									<Street2>
										<xsl:value-of select="DATA2SC/CALL/ATTR" />
									</Street2>
									<City>
										<xsl:value-of select="DATA2SC/CALL/@STATUS"></xsl:value-of>
									</City>
									<State>
										<xsl:value-of select="DATA2SC/CALL/@TYPE" />
									</State>
									<Country>
										<xsl:value-of select="DATA2SC/CALL/@CATEGORY" />
									</Country>
									<PostalCode>
										<xsl:value-of select="DATA2SC/CALL/@EQP_ID" />
									</PostalCode>
								</Address>
							</Building>
							<Notes>
								<Note>
									<xsl:for-each select="DATA2SC/CALL">
										<Subject>
											<xsl:value-of select="@TYPE" />
										</Subject>
										<NoteType>
											<xsl:value-of select="PROBLEM" />
										</NoteType>
										<NoteTypeId>
											<xsl:value-of select="@PRO"></xsl:value-of>
										</NoteTypeId>
										<NoteText>
											<xsl:value-of select="ATTR"></xsl:value-of>
										</NoteText>
										<Internal>
											<xsl:value-of select="@RECALL"></xsl:value-of>
										</Internal>
									</xsl:for-each>
								</Note>
							</Notes>
						</Equipment>
					</Equipments>
				</Appointment>
			</Appointments>
			<Notes>
				<Note>
					<xsl:for-each select="DATA2SC/CALL">
						<Subject>
							<xsl:value-of select="@TYPE" />
						</Subject>
						<NoteType>
							<xsl:value-of select="PROBLEM" />
						</NoteType>
						<NoteTypeId>
							<xsl:value-of select="@PRO"></xsl:value-of>
						</NoteTypeId>
						<NoteText>
							<xsl:value-of select="ATTR"></xsl:value-of>
						</NoteText>
						<Internal>
							<xsl:value-of select="@RECALL"></xsl:value-of>
						</Internal>
					</xsl:for-each>
				</Note>
			</Notes>
			<CallSource>
				<Id>
					<xsl:value-of select="DATA2SC/CALL/@SUB" />
				</Id>
				<KVP>
					<xsl:value-of select="DATA2SC/CALL/@TYPE"></xsl:value-of>
				</KVP>
			</CallSource>
			<Constraints>
				<Properties>
					<xsl:attribute name="name">
					<xsl:value-of select="DATA2SC/CALL/@PRO_NAME"></xsl:value-of>
					</xsl:attribute>
				</Properties>
			</Constraints>
		</Workorder>
	</xsl:template>
</xsl:stylesheet>